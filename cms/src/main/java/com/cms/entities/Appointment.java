package com.cms.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.swagger.annotations.ApiModelProperty; 
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Appointment {

	public Appointment() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int appointmentId;

	@Column(length = 50)  
	private String appointmentStatus;
	@Column(length = 50)  
	private String appointmentDateAndTime;
	@Column(length = 200)   
	private String appointmentNote;
	
	 @ApiModelProperty(required = false, hidden = true)
	 private boolean isActive;
	
	@ApiModelProperty(required = false, hidden = true)
	private Date appointmentCreateDateTime;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private Doctor  doctor;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_id")
	private Clinic clinic;
	

	public int getAppointmentID() {
		return appointmentId;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentId = appointmentID;
	}

	public String getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getAppointmentDateAndTime() {
		return appointmentDateAndTime;
	}

	public void setAppointmentDateAndTime(String appointmentDateAndTime) {
		this.appointmentDateAndTime = appointmentDateAndTime;
	}

	public String getAppointmentNote() {
		return appointmentNote;
	}

	public void setAppointmentNote(String appointmentNote) {
		this.appointmentNote = appointmentNote;
	}

	

	public Date getAppointmentCreateDateTime() {
		return appointmentCreateDateTime;
	}

	public void setAppointmentCreateDateTime(Date appointmentCreateDateTime) {
		this.appointmentCreateDateTime = appointmentCreateDateTime;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	

	


}
