package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.Allergies;
import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.repository.AllergiesRepository;
import com.cms.repository.AppointmentRepository;

@Service
public class AllergiesService {
	
	@Autowired
	public AllergiesRepository  allergiesRepository;

	public AllergiesService() {
		
	}
	
	
	public Allergies addAllergies(Allergies allergies) 
    {
 		
		allergies.setAllergyCreateDateAndTime(new java.sql.Date(System.currentTimeMillis()));
	

 		
        return allergiesRepository.save(allergies);
    	
    }
	
	  @Transactional
		 public void changeAllergiesActivationStatus(int allergyId , boolean isActive) {
			 
		  allergiesRepository.changeAllergiesActivationStatus(allergyId, isActive);
		 }
	     
	    
	     public List<Allergies> getAllListAllergies(){
	    	 
	    	 List<Allergies> AllAllergiesList = allergiesRepository.findAll();
	    	 return AllAllergiesList;
	    	 
	     }
	     
	     public Allergies getAllergiesById(int allergyId) {
	    	 Allergies allergiesByAllergyId = allergiesRepository.getAllergiesByAllergyId(allergyId);
	        return  allergiesByAllergyId;
	    
	    }

}
