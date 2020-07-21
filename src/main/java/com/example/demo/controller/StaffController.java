package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController {
	
	Logger logger = LoggerFactory.getLogger(StaffController.class);
	
	@RequestMapping("/staff")
	public String staff()
	{
		
	    logger.error("something wrong");
		return "hiii";
	}

}
