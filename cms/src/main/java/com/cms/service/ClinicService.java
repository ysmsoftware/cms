package com.cms.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
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
	
	@Autowired(required = true)
    private ClinicBranchRepository clinicBranchRepository;


	@Transactional
	public void createClinicBranch(Clinic clinic,List<ClinicBranch> clinicBranches)
	{
		List<ClinicBranch> clinicBranchCopy =new ArrayList<>(clinicBranches);
		for(ClinicBranch clinicBranch : clinicBranchCopy)
		{
			clinicBranch.setClinic(clinic);
			clinic.getClinicBranch().add(clinicBranch);
		}
		
		clinicRepository.save(clinic);
		
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
	 
	 
   //new my
	   public Clinic getClinicByBranch(ClinicBranch clinicBranch) {
	        Integer cId = clinicBranch.getClinicId();
	      
	        if (cId == null) {
	            return null; // Return null if clinicId is null
	        }
	        return clinicRepository.findById(cId).orElse(null);
	    }
	  
	
}
