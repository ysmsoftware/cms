package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	@Autowired
	public AppointmentRepository appointmentRepository;

	public AppointmentService() {
		
	}
	
	
	public Appointment addAppointment(Appointment appointment) 
    {
 		
		appointment.setAppointmentCreateDateTime(new java.sql.Date(System.currentTimeMillis()));
	

 		
        return appointmentRepository.save(appointment);
    	
    }
	
	  @Transactional
		 public void changepatientActivationStatus(int appointmentId , boolean isActive) {
			 
		  appointmentRepository.changePatientActivationStatus(appointmentId, isActive);   
		 }
	     
	    
	     public List<Appointment> getAllListAppointment(){
	    	 
	    	 List<Appointment> AllAppointmentList = appointmentRepository.findAll();
	    	 return AllAppointmentList;
	    	 
	     }
	     
	     public Appointment getAppointmentById(int appointmentId) {
	 		 Appointment appointmentByAppointmenttId = appointmentRepository.getAppointmentByAppointmenttId(appointmentId);
	        return  appointmentByAppointmenttId;
	    
	    }

}
