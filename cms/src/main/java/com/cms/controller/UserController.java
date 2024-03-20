package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cms.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController 
{
	  	@Autowired
	    private UserService userService;
	  
	  	@PostMapping("/from-staff/{staffId}")
	    public void saveUserFromStaff(@PathVariable int staffId) {
	        userService.saveUserFromStaff(staffId);
	    }
}
