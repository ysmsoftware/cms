package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.entities.Patient;
import com.cms.repository.PatientRepository;


@Service
public class PatientService {
	
	 	@Autowired
	    private PatientRepository  patientRepository;
	 	
	 	@Autowired
	 	private ClinicService clinicService;
	 	
	 	@Autowired
	 	private ClinicBranchService clinicBranchService;
	 	 
	 	public Patient addPatient(Patient patient) 
	    {
	 	
		Clinic clinic=clinicService.getClinicById(patient.getTempClinicId());
		patient.setClinic(clinic);
		patient.setActive(true);
		patient.setPatientCreatedDateTime(new java.sql.Date(System.currentTimeMillis()));
		
		ClinicBranch clinicBranch=clinicBranchService.getClinicBranchById(patient.getTempClinicBranchId());
		patient.setClinicBranch(clinicBranch);
		patient.setActive(true);
		patient.setPatientCreatedDateTime(new java.sql.Date(System.currentTimeMillis()));
		
	 		
	        return patientRepository.save(patient);
	    	
	    }
	    
	    
	 	public Patient getPatientById(int patientId) {
	 		 Patient patientByPatientId = patientRepository.getPatientByPatientId(patientId);
	        return  patientByPatientId;
	    
	    }
		
	     @Transactional
		 public void changepatientActivationStatus(int patientId , boolean isActive) {
			 
	    	patientRepository.changePatientActivationStatus(patientId, isActive);      
		 }
	     
	    
	     public List<Patient> getAllListPatient(){
	    	 
	    	 List<Patient> findAll = patientRepository.findAll();
	    	 return findAll;
	    	 
	     }
	     
	
	
}
