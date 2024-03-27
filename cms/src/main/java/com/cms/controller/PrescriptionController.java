package com.cms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Clinic;
import com.cms.entities.Prescription;
import com.cms.entities.Status;
import com.cms.service.PrescriptionService;



@RestController
public class PrescriptionController {
	
	@Autowired
	public PrescriptionService prescriptionService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(PrescriptionController.class);
	

	public PrescriptionController() {
		
	}
	

	@PostMapping("/add_prescription")
	public @ResponseBody Status addPrescription(@RequestBody Prescription prescription,@ModelAttribute Clinic clinic)
	{
	
		Prescription addPrescription =null;
		try {
				
				
			
			 addPrescription = prescriptionService.addPrescription(prescription);
			
			logger.info("prescription added. :"+ addPrescription.getPrescriptionId());
			return new Status(addPrescription.getPrescriptionId(), 1, "prescription added.", addPrescription); 
		} catch (Exception e) {
			 logger.error(e.toString());
			 return new Status(0, 0, "Failed to add Prescription.", addPrescription); 
		} 
		
	}
	
	@PostMapping("changePrescriptionActivationStatus/{prescriptionId}/{isActive}")
	public Status changePrescriptionActivationStatus(@PathVariable int prescriptionId, @RequestParam boolean isActive) {
	     			   
	     	try {
	        prescriptionService.changePrescriptionActivationStatus(prescriptionId, isActive);
	    	 if (isActive) {
	             // patient activated
	             logger.info(prescriptionId + "'s appointment activated." + " ");
	             return new Status(prescriptionId, 1, "prescription activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(prescriptionId + "'s prescription deactivated.");	    
	             return new Status(prescriptionId, 1, "prescription deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(prescriptionId, 0, "Failed to update status", null); 
	     }
	  }
	
	
	@GetMapping("getPrescriptionByPrescriptionId/{prescriptionId}")
	public @ResponseBody Status  getPrescriptionByPrescriptionId(@PathVariable int prescriptionId) {
	        
		Prescription prescription = null; 
			try {
				prescription = prescriptionService.getPrescriptionById(prescriptionId);
				logger.info("prescription fetched by id :"+ prescription.getPrescriptionId());
				return new Status(prescriptionId, 1, "prescription fetched.", prescription); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(prescriptionId, 0, "Failed to fetched prescription.", prescription); 
			}	
	}
	

	@GetMapping("/all_prescription_List")
	public List<Prescription>  allPrescriptionList() {
		List<Prescription> AllListPrescription = prescriptionService.getAllListPrescription();
			return AllListPrescription;
		
	}
	

}
