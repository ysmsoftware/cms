package com.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.entities.Status;
import com.cms.entities.User;
import com.cms.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("changeUserActivationStatus/{userId}/{isActive}")
	public Status changeUserActivationStatus(@PathVariable int userId, @RequestParam boolean isActive) {
	     			   
	     	try {
	     		userService.changeUserActivationStatus(userId, isActive);
	    	 if (isActive) {
	             
	             logger.info(userId + "'s user activated." + " ");
	             return new Status(userId, 1, "user activated successfully", null); 
	         } else {
	            
	             logger.info(userId + "'s user deactivated.");	    
	             return new Status(userId, 1, "user deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(userId, 0, "Failed to update status", null); 
	     }
	  }
	
	@GetMapping("getUserById/{userId}")
	public @ResponseBody Status  getUserById(@PathVariable int userId) {
	        
 		    User user = null;
			try {
				user =  userService.getUserById(userId);
				logger.info("Staff fetched by id :"+user.getUserId());
				return new Status(userId, 1, "user fetched.", user); 
			} catch (Exception e) {
				logger.error(e.toString());
				return new Status(userId, 0, "Failed to fetched user.", user); 
			}	
	}

}
