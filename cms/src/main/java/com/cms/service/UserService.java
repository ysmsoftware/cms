package com.cms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
    public void saveUserFromStaff(int staffId) {
        Optional<Staff> staffOptional = staffService.getStaffById(staffId);
        staffOptional.ifPresent(staff -> {
            User user = new User();
            user.setUserMobileNumberAsUsername(staff.getStaffMobileNumber());
            user.setUserPassword(staff.getStaffPassword()); // You may need to encrypt the password
            //user.setRole(staff.getStaffRole());
            userRepository.save(user);
        });
    }
}
