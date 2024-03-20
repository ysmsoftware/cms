package com.cms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.Staff;

import com.cms.repository.StaffRepository;

@Service
public class StaffService 
{
	@Autowired(required = true)
    private StaffRepository staffRepository;


    public Staff addStaff(Staff staff) 
    {
        return staffRepository.save(staff);
    }
    
  
    public Optional<Staff> getStaffById(int staffId) {
		return staffRepository.findById(staffId);
	}
}
