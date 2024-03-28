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

import com.cms.entities.Patient;
import com.cms.entities.Status;
import com.cms.service.PatientService;


@RestController
public class PatientController 
{
	@Autowired(required = true)
	private PatientService patientService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(PatientController.class);
	
	
	
	@PostMapping("/addPatient")
	public @ResponseBody Status addPatient(@RequestBody Patient patient)
	{
	
		Patient addPatient =null;
		try {
			addPatient = patientService.addPatient(patient);
			
			logger.info("Patient added. :"+ addPatient.getPatientId());
			return new Status(addPatient.getPatientId(), 1, "patient added.", addPatient); 
		} catch (Exception e) {
			 logger.error(e.toString());
			 return new Status(0, 0, "Failed to add patient.", addPatient); 
		} 
		
		
	}
	
	@PostMapping("changePatientActivationStatus/{patientId}/{isActive}")
	public Status changeClinicActivationStatus(@PathVariable int patientId, @RequestParam boolean isActive) {
	     			   
	     	try {
	        patientService.changepatientActivationStatus(patientId, isActive);
	    	 if (isActive) {
	             // patient activated
	             logger.info(patientId + "'s patient activated." + " ");
	             return new Status(patientId, 1, "patient activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(patientId + "'s patient deactivated.");	    
	             return new Status(patientId, 1, "patient deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(patientId, 0, "Failed to update status", null); 
	     }
	  }
	
	
	
	@GetMapping("getPatientByPatientId/{patientId}")
	public @ResponseBody Status  getPatientByPatientId(@PathVariable int patientId) {
	        
 		    Patient patient = null;
			try {
				patient =  patientService.getPatientById(patientId);
				logger.info("Patient fetched by id :"+ patient.getPatientId());
				return new Status(patientId, 1, "patient fetched.", patient); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(patientId, 0, "Failed to fetched patient.", patient); 
			}	
	}
	
	@GetMapping("/allPatientList")
	public List<Patient>  AllPatientList() {
	       List<Patient> allListPatient = patientService.getAllListPatient();
			return allListPatient;
		
	}
	
	
	
} 
	
	

