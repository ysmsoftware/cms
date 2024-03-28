package com.cms.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.entities.Staff;
import com.cms.entities.User;
import com.cms.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
		
	@Transactional
	public Staff addStaff(Staff staff) {
		
		User user = new User();
		user.setUserName(staff.getStaffMobileNumber());
		user.setUserPassword(staff.getStaffPassword());
		user.setUserRole(staff.getStaffRole());
		user.setUserCreated(staff.getStaffCreated());
		user.setStaff(staff);
		//System.out.println(user.toString());
		staff.setUser(user);
		staff.setStaffCreated(new java.sql.Date(System.currentTimeMillis()));
		staff.setActive(true);
		return staffRepository.save(staff);
	}

	public Staff getStaffById(int staffId) {
		
		Staff staff=staffRepository.getStaffByStaffId(staffId);
		return staff;
		
	}
	
	 @Transactional
	 public void changeStaffActivationStatus(int staffId,boolean isActive) {
		 
	       staffRepository.changeStaffActivationStatus(staffId, isActive);    
	 }
}
