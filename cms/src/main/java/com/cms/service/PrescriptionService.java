package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.Appointment;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.entities.Prescription;
import com.cms.repository.PrescriptionRepository;

@Service
public class PrescriptionService {
	
	@Autowired
	public PrescriptionRepository prescriptionRepository;

	public PrescriptionService() {
		
	}
	
	
	public Prescription addPrescription(Prescription prescription) 
    {
 		Clinic clinic = new Clinic();
 		ClinicBranch clinicBranch = new ClinicBranch();
 		prescription.setClinic(clinic);
 		prescription.setClinicBranch(clinicBranch);
		prescription.setPrescriptionCreateDateAndTime(new java.sql.Date(System.currentTimeMillis()));
		
        return prescriptionRepository.save(prescription);
    	
    }
	
	  @Transactional
		 public void changePrescriptionActivationStatus(int prescriptionId , boolean isActive) {
			 
		  prescriptionRepository.changePrescriptionActivationStatus(prescriptionId, isActive);
		 }
	     
	    
	     public List<Prescription> getAllListPrescription(){
	    	 
	    	 List<Prescription> AllPrescriptionList = prescriptionRepository.findAll();
	    	 return AllPrescriptionList;
	    	 
	     }
	     
	     public Prescription getPrescriptionById(int prescriptionId) {
	    	 Prescription prescriptionByPrescriptionId = prescriptionRepository.getPrescriptionByPrescriptionId(prescriptionId);
	        return  prescriptionByPrescriptionId;
	    
	    }

}
