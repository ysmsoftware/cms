package com.cms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.entities.Status;
import com.cms.service.AppointmentService;



@RestController
public class AppointmentController {
	
	@Autowired
	public AppointmentService appointmentService;
	
	Logger logger = (Logger) LoggerFactory.getLogger(AppointmentController.class);
	

	public AppointmentController() {
		
	}
	

	@PostMapping("/addAppointment")
	public @ResponseBody Status addAppointment(@RequestBody Appointment appointment)
	{
	
		Appointment addAppointment =null;
		try {
			 addAppointment = appointmentService.addAppointment(appointment);
			
			logger.info("appointment added. :"+ addAppointment.getAppointmentId());
			return new Status(addAppointment.getAppointmentId(), 1, "appointment added.", addAppointment); 
		} catch (Exception e) {
			 logger.error(e.toString());
			 return new Status(0, 0, "Failed to add appointment.", addAppointment); 
		} 
		
	}
	
	@PostMapping("changeAppointmentActivationStatus/{appointmentId}/{isActive}")
	public Status changeAppointmentActivationStatus(@PathVariable int appointmentId, @RequestParam boolean isActive) {
	     			   
	     	try {
	        appointmentService.changepatientActivationStatus(appointmentId, isActive);
	    	 if (isActive) {
	             // patient activated
	             logger.info(appointmentId + "'s appointment activated." + " ");
	             return new Status(appointmentId, 1, "appointment activated successfully", null); 
	         } else {
	             // Clinic deactivated
	             logger.info(appointmentId + "'s appointment deactivated.");	    
	             return new Status(appointmentId, 1, "appointment deactivated successfully", null); 
	         }
	    	 
	     } catch (Exception e) {	    	 
	    	 logger.error(e.toString());
	         return new Status(appointmentId, 0, "Failed to update status", null); 
	     }
	  }
	
	
	@GetMapping("getAppointmentByAppointmentId/{appointmentId}")
	public @ResponseBody Status  getAppointmentByAppointmentId(@PathVariable int appointmentId) {
	        
			Appointment appointment = null;
			try {
				 appointment = appointmentService.getAppointmentById(appointmentId);
				logger.info("Appointment fetched by id :"+ appointment.getAppointmentId());
				return new Status(appointmentId, 1, "appointment fetched.", appointment); 
			} catch (Exception e) {
				 logger.error(e.toString());
				 return new Status(appointmentId, 0, "Failed to fetched appointment.", appointment); 
			}	
	}
	

	@GetMapping("/all_Appointment_List")
	public List<Appointment>  allAppointment_List() {
		List<Appointment> allListAppointment = appointmentService.getAllListAppointment();
			return allListAppointment;
		
	}
	

}
