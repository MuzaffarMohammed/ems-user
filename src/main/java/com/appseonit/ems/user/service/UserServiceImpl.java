package com.appseonit.ems.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appseonit.ems.user.client.InstituteClient;
import com.appseonit.ems.user.dto.InstituteDTO;
import com.appseonit.ems.user.dto.Response;
import com.appseonit.ems.user.entity.EmsUser;
import com.appseonit.ems.user.repository.UserJPARepository;
import com.appseonit.ems.user.util.Constants;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

	Logger log = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserJPARepository userJPA;
	
	@Autowired
	InstituteClient instituteClient;
	
	public UserServiceImpl() {
	}

	@Override
	public Response checkInstituteExistence(String userName) {
		log.info("In checkInstituteExistence...");
		String responseMsg = null;
		int status_code = Constants.ERROR_CODE;
		Object responseData = null;
		try {
			
			if(userName != null && !userName.trim().equals("")) {
				EmsUser entity = userJPA.findOneByUserName(userName);
				if(entity != null) {
					Integer instituteId = entity.getInstituteId();
					if(instituteId != null) {
						InstituteDTO instituteDTO = instituteClient.getInstituteDetails(instituteId);
						if(instituteDTO != null) {
							responseData = instituteDTO;
							status_code = Constants.SUCCESS_CODE;
						}else {
							status_code = Constants.NO_INSTITUTE_EXIST_CODE; 
						}
					}else {
						status_code = Constants.NO_INSTITUTE_EXIST_CODE; 
					}
				}else {
					responseMsg = Constants.USER_DOES_NOT_EXIST_MSG;
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return new Response(status_code, responseMsg, responseData);
	}
}
