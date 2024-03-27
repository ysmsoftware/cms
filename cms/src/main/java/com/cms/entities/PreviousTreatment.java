package com.cms.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class PreviousTreatment {

	public PreviousTreatment() {
	
	}
	 @ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient  patient;
	
	 @ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "appointmentId")
	private Appointment  appointment;
	
	 @ApiModelProperty(required = false, hidden = true)
	 @ManyToOne(cascade = CascadeType.ALL)  // Corrected annotation
	 @JoinColumn(name = "staffId")
	 private Staff staff;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int previousTreatmentId ;
	
	
	private String treatmentDate;
	
	private String treatmentDignosis;
	
	private String treatmentMedication;
	
	private String treatmentProcedure;
	
	private String treatmentNote;
	
	private Date treatmentCreateDateAndTime;
	
	 @ApiModelProperty(required = false, hidden = true)
	 private boolean isActive;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public int getPreviousTreatmentId() {
		return previousTreatmentId;
	}

	public void setPreviousTreatmentId(int previousTreatmentId) {
		this.previousTreatmentId = previousTreatmentId;
	}

	public String getTreatmentDate() {
		return treatmentDate;
	}

	public void setTreatmentDate(String treatmentDate) {
		this.treatmentDate = treatmentDate;
	}

	public String getTreatmentDignosis() {
		return treatmentDignosis;
	}

	public void setTreatmentDignosis(String treatmentDignosis) {
		this.treatmentDignosis = treatmentDignosis;
	}

	public String getTreatmentMedication() {
		return treatmentMedication;
	}

	public void setTreatmentMedication(String treatmentMedication) {
		this.treatmentMedication = treatmentMedication;
	}

	public String getTreatmentProcedure() {
		return treatmentProcedure;
	}

	public void setTreatmentProcedure(String treatmentProcedure) {
		this.treatmentProcedure = treatmentProcedure;
	}

	public String getTreatmentNote() {
		return treatmentNote;
	}

	public void setTreatmentNote(String treatmentNote) {
		this.treatmentNote = treatmentNote;
	}

	public Date getTreatmentCreateDateAndTime() {
		return treatmentCreateDateAndTime;
	}

	public void setTreatmentCreateDateAndTime(Date treatmentCreateDateAndTime) {
		this.treatmentCreateDateAndTime = treatmentCreateDateAndTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	

}
