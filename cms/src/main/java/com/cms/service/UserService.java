package com.cms.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.entities.User;
import com.cms.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	 public void changeUserActivationStatus(int userId,boolean isActive) {
		 
		 userRepository.changeUserActivationStatus(userId, isActive);    
	 }
	
   public User getUserById(int userId) {
		
		User user=userRepository.getUserByUserId(userId);
		return user;
		
	}
	
}
