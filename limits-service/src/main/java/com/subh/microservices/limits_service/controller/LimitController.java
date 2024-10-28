package com.subh.microservices.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subh.microservices.limits_service.bean.Limits;
import com.subh.microservices.limits_service.configuration.Configuration;

@RestController
public class LimitController {

	@Autowired(required=true)
	private Configuration configuration;
	
	@GetMapping("/limit")
	public Limits retriveLimits() {
		
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		
		//return new Limits(1, 52);
		
	}
}
