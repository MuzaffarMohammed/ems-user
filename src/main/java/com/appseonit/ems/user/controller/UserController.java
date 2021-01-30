package com.appseonit.ems.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appseonit.ems.user.dto.Response;
import com.appseonit.ems.user.service.UserService;


@RestController
@RequestMapping("/user/details")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService service;
	
	@GetMapping("/{userName}")
	public Response checkInstituteExistence(@PathVariable String userName) {
		log.info("Inside getUserDetails...");
		return service.checkInstituteExistence(userName);
	}
	

}
