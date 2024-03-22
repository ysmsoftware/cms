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
import com.cms.entities.Clinic;
import com.cms.entities.Status;
import com.cms.service.ClinicService;

@RestController
public class ClinicController
{
	@Autowired
    private ClinicService clinicService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(ClinicController.class);
	
	public ClinicController() {
		super();
	}
	 	
	@PostMapping("addClinic")
	public @ResponseBody Status addClinic(@RequestBody Clinic clinic) {  
		
			Clinic clinicReturned = null;
			try {
				clinicReturned = clinicService.addClinic(clinic);
				logger.info("Clinic added. :"+clinicReturned.getClinicId());
				 return new Status(clinicReturned.getClinicId(), 1, "Clinic added.", clinicReturned); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(0, 0, "Failed to add clinic.", clinicReturned); 
			}			  
	} 
	
 	@GetMapping("getClinicById/{clinicId}")
	public @ResponseBody Status  getClinicById(@PathVariable int clinicId) {
	        
 		    Clinic clinic = null;
			try {
				clinic =  clinicService.getClinicById(clinicId);
				logger.info("Clinic fetched by id :"+clinic.getClinicId());
				return new Status(clinicId, 1, "Clinic fetched.", clinic); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(clinicId, 0, "Failed to fetched clinic.", clinic); 
			}	
	}
		 		 	
	@PostMapping("changeClinicActivationStatus/{clinicId}/{isActive}")
	public Status changeClinicActivationStatus(@PathVariable int clinicId, @RequestParam boolean isActive) {
	     			   
	     	try {
	         clinicService.changeClinicActivationStatus(clinicId, isActive);
	    	 if (isActive) {
	             // Clinic activated
	             logger.info(clinicId + "'s clinic activated." + " ");
	             return new Status(clinicId, 1, "Clinic activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(clinicId + "'s clinic deactivated.");	    
	             return new Status(clinicId, 1, "Clinic deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(clinicId, 0, "Failed to update status", null); 
	     }
	  }
}
