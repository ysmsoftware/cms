package com.cms.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;

import com.cms.service.ClinicBranchService;
import com.cms.service.ClinicService;



@RestController
public class ClinicController
{
	@Autowired
    private ClinicService clinicService;
	
	@Autowired
	private ClinicBranchService clinicBranchService;
	
	//Logger logger = (Logger) LoggerFactory.logger(ClinicController.class);
	
	 @PostMapping("/clinic/{clinicId}/addClinicBranchFromClinic")
	    public ResponseEntity<String> createClinicBranch(@PathVariable int clinicId, @RequestBody List<ClinicBranch> clinicBranches) {
	        Clinic clinic = clinicService.getClinicById(clinicId);
	        if (clinic == null) {
	            return new ResponseEntity<>("Clinic not found with ID: " + clinicId, HttpStatus.NOT_FOUND);
	        }
	        
	        clinicService.createClinicBranch(clinic, clinicBranches);
	        
	        return new ResponseEntity<>("Clinic branches created successfully", HttpStatus.CREATED);
	    }
	
	 @GetMapping("/clinic/{clinicId}")
	    public Clinic getClinicById(@PathVariable int clinicId) {
	        Clinic clinic = clinicService.getClinicById(clinicId);
	        return clinic;
	    }
		
	 @PostMapping("/clinic/addClinic")
		  public Clinic addClinic(@RequestBody Clinic clinic)
		  {  
			  return this.clinicService.addClinic(clinic);
		  
		  }
		 
	


	 
	
}
