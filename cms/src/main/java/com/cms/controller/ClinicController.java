package com.cms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.service.ClinicService;


@RestController
public class ClinicController
{
	@Autowired
    private ClinicService clinicService;
	
	//Logger logger = (Logger) LoggerFactory.logger(ClinicController.class);
	
	@PostMapping("/clinics")
	public Clinic addClinic(@RequestBody Clinic clinic)
	{
		return clinicService.addClinic(clinic);
		
		
	}
	
	@GetMapping("/clinics")
	public List<Clinic> getClinic()
	{
		return clinicService.getClinic();
		
	}
	
	@DeleteMapping("/clinic/{clinicId}")
	public ResponseEntity<HttpStatus> deleteClinic(@PathVariable String clinicId)
	{
		try
		{
		 this.clinicService.deleteClinic(Integer.parseInt(clinicId));
		 return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@PutMapping("/clinic")
	public Clinic updateClinic(@RequestBody Clinic clinic)
	{
		return this.clinicService.updateClinic(clinic);
		
	}
	

	/*
	 * @GetMapping("/clinic/{clinicId}") public Clinic getClinic(@PathVariable
	 * String clinicId) { return
	 * this.clinicService.getClinic(Integer.parseInt(clinicId));
	 * 
	 * }
	 */
	 
	
}
