package com.cms.service;


import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.repository.ClinicBranchRepository;
import com.cms.repository.ClinicRepository;

@Service
public class ClinicService 
{
	@Autowired(required = true)
    private ClinicRepository clinicRepository;
	
	@Autowired(required = true)
    private ClinicBranchRepository clinicBranchRepository;


	@Transactional
	public Clinic createClinicBranch(Clinic clinic,List<ClinicBranch> clinicBranches){
		List<ClinicBranch> clinicBranchCopy =new ArrayList<>(clinicBranches);
		for(ClinicBranch clinicBranch : clinicBranchCopy)
		{
			clinicBranch.setClinic(clinic);
			clinic.getClinicBranch().add(clinicBranch);
		}
		
		return clinicRepository.save(clinic);
		
	}
   

	public Clinic getClinicById(int clinicId) {
	//System.out.println(clinicId);
       Clinic clinicById = clinicRepository.getClinicByClinicId(clinicId);
        return  clinicById;
               
    }
		
    public Clinic addClinic(Clinic clinic) 
	  { 
		  return clinicRepository.save(clinic);
	  }
	 
    
    @Transactional
    public void deleteClinic(int clinicId) {
        clinicRepository.deleteById(clinicId);
    }
    
    
	    //new my
	 public Clinic getClinicByBranch(ClinicBranch clinicBranch) {
	        Integer cId = clinicBranch.getClinicId();
	        System.out.println(cId);
	      
	        if (cId == null) {
	            return null; // Return null if clinicId is null
	        }
	        return clinicRepository.findById(cId).orElse(null);
	    }
	 
	 
	 @Transactional
	 public void setActiveStatus(int clinicId, boolean isActive) {
		 
	       clinicRepository.updateClinicStatus(clinicId, isActive);
	        
	    }
	
}
