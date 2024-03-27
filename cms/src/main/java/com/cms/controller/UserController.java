package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Clinic;
import com.cms.repository.UserRepository;
import com.cms.service.UserService;

@RestController
public class UserController 						
{
	 @Autowired
	 UserRepository  userRepository;
	 
	 @Autowired
	 UserService  userService;
	
	  
	 
		
	  	
}
