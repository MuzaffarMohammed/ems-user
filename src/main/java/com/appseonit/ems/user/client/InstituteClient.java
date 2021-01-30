package com.appseonit.ems.user.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.appseonit.ems.user.dto.InstituteDTO;


@FeignClient("EMS-INSTITUTE")
@RibbonClient("EMS-INSTITUTE")
public interface InstituteClient {

	@GetMapping("/institute/details/{instituteId}")
	InstituteDTO getInstituteDetails(@PathVariable int instituteId);
}
