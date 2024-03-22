package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.cms.service.ClinicBranchService;



@RestController
public class ClinicBranchController 
{
	
	@Autowired(required = true)
	private ClinicBranchService clinicBranchService;
		
	
   
	 
	 
	/*
	 * @GetMapping("/clinicBranch/getClinicBranches") public List<ClinicBranch>
	 * getClinicBranch() { return clinicBranchService.getClinicBranch();
	 * 
	 * }
	 */
	
	/*
	 * @DeleteMapping("/clinicBranch/{clinicBranchId}") public
	 * ResponseEntity<HttpStatus> deleteClinicBranch(@PathVariable String
	 * clinicBranchId) { try {
	 * this.clinicBranchService.deleteClinicBranch(Integer.parseInt(clinicBranchId))
	 * ; return new ResponseEntity<>(HttpStatus.OK); } catch (Exception e) { //
	 * TODO: handle exception return new
	 * ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); }
	 * 
	 * }
	 */
	
	/*
	 * @PutMapping("/clinicBranch") public ClinicBranch updateClinic(@RequestBody
	 * ClinicBranch clinicBranch) { return
	 * this.clinicBranchService.updateClinicBranch(clinicBranch);
	 * 
	 */
	
	
	
	  //new my
	  
		/*
		 * @PostMapping("/clinicBranch/addClinicBranches") public ClinicBranch
		 * addClinicBranche(@RequestBody ClinicBranch clinicBranch) throws Exception {
		 * 
		 * Clinic clinic = clinicService.getClinicByBranch(clinicBranch); Integer
		 * cId=clinicBranch.getClinicId();
		 * 
		 * Clinic clinic1 = clinicService.getClinicById(cId);
		 * 
		 * if (clinic1 == null) {
		 * 
		 * throw new Exception("Clinic not found for cId: " +
		 * clinicBranch.getClinicId()); }
		 * 
		 * // Set the Clinic entity in the ClinicBranch clinicBranch.setClinic(clinic);
		 * 
		 * 
		 * // Save the ClinicBranch return return
		 * clinicBranchService.addClinicBranch(clinicBranch); }
		 */
	 
} 
	
	

