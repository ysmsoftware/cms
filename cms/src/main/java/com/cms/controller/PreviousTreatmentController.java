package com.cms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.PreviousTreatment;
import com.cms.entities.Status;
import com.cms.service.PreviousTreatmentService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class PreviousTreatmentController {

	public PreviousTreatmentController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public PreviousTreatmentService previousTreatmentService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(PreviousTreatmentController.class);
	


	@PostMapping("/add_previous_treatment")
	public @ResponseBody Status addPreviousTreatment(@RequestBody PreviousTreatment previousTreatment)
	{
	
		PreviousTreatment addPreviousTreatment  =null;
		try {
			 addPreviousTreatment = previousTreatmentService.addPreviousTreatment(previousTreatment);
			
			logger.info("PreviousTreatment added. :"+ addPreviousTreatment.getPreviousTreatmentId());
			return new Status(addPreviousTreatment.getPreviousTreatmentId(), 1, "PreviousTreatment added.", addPreviousTreatment); 
		} catch (Exception e) {
			 logger.error(e.toString());
			 return new Status(0, 0, "Failed to add PreviousTreatment.", addPreviousTreatment); 
		} 
		
	}
	
	@PostMapping("changePreviousTreatmentActivationStatus/{previousTreatmentId}/{isActive}")
	public Status changePreviousTreatmentActivationStatus(@PathVariable int previousTreatmentId, @RequestParam boolean isActive) {
	     			   
	     	try {
	     		previousTreatmentService.changePreviousTreatmentActivationStatus(previousTreatmentId, isActive);
	    	 if (isActive) {
	             // patient activated
	             logger.info(previousTreatmentId + "'s previousTreatment activated." + " ");
	             return new Status(previousTreatmentId, 1, "previousTreatment activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(previousTreatmentId + "'s previousTreatment deactivated.");	    
	             return new Status(previousTreatmentId, 1, "previousTreatment deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(previousTreatmentId, 0, "Failed to update status", null); 
	     }
	  }
	
	
	@GetMapping("getpreviousTreatmentBypreviousTreatmentId/{previousTreatmentId}")
	public @ResponseBody Status  getpreviousTreatmentBypreviousTreatmentId(@PathVariable int previousTreatmentId) {
	        
		PreviousTreatment getPreviousTreatmentById = null;
			try {
				getPreviousTreatmentById = previousTreatmentService.getPreviousTreatmentById(previousTreatmentId);
				logger.info("PreviousTreatment fetched by id :"+ getPreviousTreatmentById.getPreviousTreatmentId());
				return new Status(previousTreatmentId, 1, "PreviousTreatment fetched.", getPreviousTreatmentById); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(previousTreatmentId, 0, "Failed to fetched PreviousTreatment.", getPreviousTreatmentById); 
			}	
	}
	

	@GetMapping("/all_Previous_Treatment_list")
	public List<PreviousTreatment>  PreviousTreatmentList() {
		  List<PreviousTreatment> previousTreatmentList = previousTreatmentService.getPreviousTreatmentList();
			return previousTreatmentList;
		
	}
	

}
