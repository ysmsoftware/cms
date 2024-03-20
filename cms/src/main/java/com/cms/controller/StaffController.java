package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cms.entities.Staff;

import com.cms.service.StaffService;

@RestController
public class StaffController
{
	@Autowired
    private StaffService staffService;
	

	
	@PostMapping("/staff")
	public Staff addStaff(@RequestBody Staff staff)
	{
		return staffService.addStaff(staff);
		
		
	}
	
	 @GetMapping("/{staffId}")
	    public Staff getStaffById(@PathVariable int staffId) {
	        return staffService.getStaffById(staffId)
	                .orElseThrow(() -> new RuntimeException("Staff not found"));
	    }
}
