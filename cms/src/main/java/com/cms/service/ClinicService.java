package com.cms.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.repository.ClinicBranchRepository;
import com.cms.repository.ClinicRepository;

@Service
public class ClinicService 
{
	@Autowired(required = true)
    private ClinicRepository clinicRepository;
	
	@Autowired
	private ClinicBranchRepository clinicBranchRepository;
	
	@Transactional
	public Clinic addClinic(Clinic clinic){
				
		    ClinicBranch clinicBranch = new ClinicBranch();
			clinicBranch.setClinicBranchName("Main Branch");
			clinicBranch.setClinicBranchLocation(clinic.getClinicLocation());
			clinicBranch.setClinicBranchLocationLatitude(clinic.getClinicLocationLatitude());
			clinicBranch.setClinicBranchLocationLongitude(clinic.getClinicLocationLongitude());
			clinicBranch.setClinicBranchEmail(clinic.getClinicEmail());
            clinicBranch.setClinicBranchContactNumber1(clinic.getClinicContactNumber1());
            clinicBranch.setClinicBranchContactNumber2(clinic.getClinicContactNumber2());
            clinicBranch.setClinicBranchEstablishedDate(clinic.getClinicEstablishedDate());
			clinicBranch.setClinicBranchCreated(new java.sql.Date(System.currentTimeMillis()));
			clinicBranch.setClinicBranchType(clinic.getClinicType());
			clinicBranch.setActive(true);
			clinicBranch.setClinic(clinic);
			
			clinic.getClinicBranch().add(clinicBranch);
			clinic.setClinicCreated(new java.sql.Date(System.currentTimeMillis()));
		    clinic.setActive(true);
		
		    return clinicRepository.save(clinic);		
	}
   

	public Clinic getClinicById(int clinicId) {
	
            Clinic clinic = clinicRepository.getClinicByClinicId(clinicId);
            return  clinic;
               
    }
	   	 
	 @Transactional
	 public void changeClinicActivationStatus(int clinicId,boolean isActive) {
		 
	       clinicRepository.changeClinicActivationStatus(clinicId,isActive);	        
	 }
	 
	 //this method is for adding clinicBranch under specified clinic Id
	 public ClinicBranch addClinicBranch(int clinicId, ClinicBranch clinicBranch) {
	        Clinic clinic = clinicRepository.getClinicByClinicId(clinicId);
	        clinicBranch.setClinic(clinic); // Associate the clinic with the branch
	        return clinicBranchRepository.save(clinicBranch);
	    }
	 
	 
	
}
