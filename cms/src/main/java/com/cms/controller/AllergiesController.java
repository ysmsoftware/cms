package com.cms.controller;

import java.util.List;

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

import com.cms.entities.Allergies;
import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.entities.Status;
import com.cms.service.AllergiesService;
import com.cms.service.AppointmentService;



@RestController
public class AllergiesController {
	
	@Autowired
	public AllergiesService allergiesService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(AllergiesController.class);
	

	public AllergiesController() {
		
	}
	

	@PostMapping("/addAllergies")
	public @ResponseBody Status addAllergies(@RequestBody Allergies allergies)
	{
	
			Allergies addAllergies  =null;
		try {
			  addAllergies = allergiesService.addAllergies(allergies);
			
			logger.info("allergies added. :"+ addAllergies.getAllergyId());
			return new Status(addAllergies.getAllergyId(), 1, "allergy added.", addAllergies); 
		} catch (Exception e) {
			 logger.error(e.toString());
			 return new Status(0, 0, "Failed to add allergy.", addAllergies); 
		} 
		
	}
	
	@PostMapping("changeAllergyActivationStatus/{allergyId}/{isActive}")
	public Status changeAppointmentActivationStatus(@PathVariable int allergyId, @RequestParam boolean isActive) {
	     			   
	     	try {
	     		allergiesService.changeAllergiesActivationStatus(allergyId, isActive);
	    	 if (isActive) {
	             // patient activated
	             logger.info(allergyId + "'s appointment activated." + " ");
	             return new Status(allergyId, 1, "allergy activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(allergyId + "'s allergy deactivated.");	    
	             return new Status(allergyId, 1, "allergy deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(allergyId, 0, "Failed to update status", null); 
	     }
	  }
	
	
	@GetMapping("getAllergyByAllergyId/{allergyId}")
	public @ResponseBody Status  getAppointmentByAppointmentId(@PathVariable int allergyId) {
	        
			Allergies allergiesById = null;
			try {
				allergiesById = allergiesService.getAllergiesById(allergyId);
				logger.info("allergies fetched by id :"+ allergiesById.getAllergyId());
				return new Status(allergyId, 1, "allergie fetched.", allergiesById); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(allergyId, 0, "Failed to fetched appointment.", allergiesById); 
			}	
	}
	

	@GetMapping("/all_allergies_List")
	public List<Allergies>  allAllergies_List() {
		 List<Allergies> allListAllergies = allergiesService.getAllListAllergies();
			return allListAllergies;
		
	}
	

}
