package com.cms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.entities.ClinicBranch;
import com.cms.entities.Status;
import com.cms.service.ClinicBranchService;


@RestController
public class ClinicBranchController 
{
	
	@Autowired(required = true)
	private ClinicBranchService clinicBranchService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(ClinicController.class);
	
	@PostMapping("addClinicBranch")
	public @ResponseBody  Status addClinicBranch(@RequestBody ClinicBranch clinicBranch) {
		
	    ClinicBranch addedBranch =null;
	    try
	    {
	    	addedBranch=clinicBranchService.addClinicBranch(clinicBranch);
	    	logger.info("ClinicBranch added :"+addedBranch.getClinicBranchId());
	    	return new Status(addedBranch.getClinicBranchId(), 1, "Clinic Branch added.", addedBranch);
	    }
	    catch(Exception e)
	    {
	    	logger.error(e.toString());
	    	return new Status(0, 0, "Failed to add Clinic Branch.", addedBranch);
	    }
	}
	
	
   @PostMapping("getClinicBranchById/{clinicBranchId}")
   public @ResponseBody Status  getClinicBranchById(@PathVariable int clinicBranchId){
	 ClinicBranch clinicBranch=null;
	 try
	 {
		 clinicBranch=clinicBranchService.getClinicBranchById(clinicBranchId); 
		 logger.info("ClinicBranch fetched by branchId :"+clinicBranch.getClinicBranchId());
		 return new Status(clinicBranchId, 1, "ClinicBranch fetched.", clinicBranch); 
	 }
	 catch(Exception e)
	 {
		 logger.error(e.toString());
		 return new Status(clinicBranchId, 0, "ClinicBranch failed to fetched.", clinicBranch);
	 }
	   
   } 
//	 @PostMapping("changeClinicBranchActivationStatus/{clinicBranchId}/{isActive}")
//	 public Status changeClinicBranchActivationStatus(@PathVariable int clinicBranchId, @RequestParam boolean isActive)	
//	 {
//		 try
//		 {
//		 clinicBranchService.changeClinicBranchActivationStatus(clinicBranchId, isActive);
//		 if (isActive) {
//             // Clinic activated
//             logger.info(clinicBranchId + "'s clinic branch activated." + " ");
//             return new Status(clinicBranchId, 1, "Clinic branch activated successfully", null); 
//         } else {
//             // Clinic deactivated
//             logger.info(clinicBranchId + "'s clinic branch deactivated.");	    
//             return new Status(clinicBranchId, 1, "Clinic branch deactivated successfully", null); 
//         }
//		 
//		 }
//		 catch(Exception e)
//		 {
//			 logger.error(e.toString());
//			 return new Status(clinicBranchId, 0, "Failed to update status", null);
//		 }
//		 
//	 }
	 
	 @PostMapping("ClinicBranchActivationStatus/{clinicBranchId}/{isActive}")
		public Status ClinicBranchActivationStatus(@PathVariable int clinicBranchId, @RequestParam boolean isActive) {
		     			   
		     	try {
		         clinicBranchService.changeClinicBranchActivationStatus(clinicBranchId, isActive);
		    	 if (isActive) {
		             // Clinic activated
		             logger.info(clinicBranchId + "'s clinic branch activated." + " ");
		             return new Status(clinicBranchId, 1, "Clinic branch activated successfully", null); 
		         } else {
		             // Clinic deactivated
		             logger.info(clinicBranchId + "'s clinic branch deactivated.");	    
		             return new Status(clinicBranchId, 1, "Clinic branch deactivated successfully", null); 
		         }
		    	 
		     } catch (Exception e) {	    	 
		    	 logger.error(e.toString());
		         return new Status(clinicBranchId, 0, "Failed to update status", null); 
		     }
    }
  
}
  
	 
	 
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
	 
 
	
	

