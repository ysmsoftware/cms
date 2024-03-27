package com.cms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.stereotype.Service;

import com.cms.entities.Clinic;
import com.cms.entities.Staff;
import com.cms.entities.User;
import com.cms.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private StaffService staffService; 
	
	@Autowired
	private UserRepository userRepository;
	
		
}
