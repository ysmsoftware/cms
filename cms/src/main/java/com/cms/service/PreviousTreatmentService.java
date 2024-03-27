package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cms.entities.Allergies;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.entities.PreviousTreatment;
import com.cms.repository.ClinicRepository;
import com.cms.repository.PreviousTreatmentRepository;




@Service
public class PreviousTreatmentService 
{
	@Autowired(required = true)
    private PreviousTreatmentRepository previousTreatmentRepository;


    public PreviousTreatment addPreviousTreatment(PreviousTreatment previousTreatment) 
    {
    	previousTreatment.setTreatmentCreateDateAndTime(new java.sql.Date(System.currentTimeMillis()));
        return previousTreatmentRepository.save(previousTreatment);
    }
    
    public List<PreviousTreatment> getPreviousTreatmentList()
    {
    	List<PreviousTreatment> previousTreatmentList = previousTreatmentRepository.findAll();
    	return previousTreatmentList;
    	
    }
    
    public PreviousTreatment getPreviousTreatmentById(int previousTreatmentId) {
    PreviousTreatment previousTreatmentByPreviousTreatment = previousTreatmentRepository.getPreviousTreatmentByPreviousTreatment(previousTreatmentId);
       return  previousTreatmentByPreviousTreatment;
   
   }

    @Transactional
	 public void changePreviousTreatmentActivationStatus(int previousTreatmentId , boolean isActive) {
		 
    	previousTreatmentRepository.changePreviousTreatmentActivationStatus(previousTreatmentId, isActive);
	 }
	
    
    
}
