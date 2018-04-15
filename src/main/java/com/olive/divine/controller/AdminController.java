package com.olive.divine.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.olive.divine.beans.AdminUser;

public class AdminController {

	private static final Logger logger = Logger.getLogger(AdminController.class);
	
	@RequestMapping(value="/admin", method=RequestMethod.GET, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public void postUser(@RequestParam(value="name") String name, @RequestParam(value="email") String email){
		
	}
}
