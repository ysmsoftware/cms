package com.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.entities.Staff;
import com.cms.entities.Status;
import com.cms.service.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(StaffController.class);

	public StaffController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("addStaff")
	public @ResponseBody Status addStaff(@RequestBody Staff staff) {  
		
			Staff staff1 = null;
			try {
				staff1 = staffService.addStaff(staff);
				logger.info("Staff added. :"+staff1.getStaffId());
				 return new Status(staff1.getStaffId(), 1, "Staff added.", staff1); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(0, 0, "Failed to add staff.", staff1); 
			}	 		  
	}
	
	@GetMapping("getStaffById/{staffId}")
	public @ResponseBody Status  getStaffById(@PathVariable int staffId) {
	        
 		    Staff staff = null;
			try {
				staff =  staffService.getStaffById(staffId);
				logger.info("Staff fetched by id :"+staff.getStaffId());
				return new Status(staffId, 1, "Staff fetched.", staff); 
			} catch (Exception e) {
				logger.error(e.toString());
				return new Status(staffId, 0, "Failed to fetched staff.", staff); 
			}	
	}
	
	@PostMapping("changeStaffActivationStatus/{staffId}/{isActive}")
	public Status changeStaffActivationStatus(@PathVariable int staffId, @RequestParam boolean isActive) {
	     			   
	     	try {
	         staffService.changeStaffActivationStatus(staffId, isActive);
	    	 if (isActive) {
	             
	             logger.info(staffId + "'s staff activated." + " ");
	             return new Status(staffId, 1, "staff activated successfully", null); 
	         } else {
	             
	             logger.info(staffId + "'s staff deactivated.");	    
	             return new Status(staffId, 1, "staff deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(staffId, 0, "Failed to update status", null); 
	     }
	  }

}
