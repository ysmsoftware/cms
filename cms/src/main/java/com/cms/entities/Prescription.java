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
public class Prescription {

	public Prescription() {
	
	}
	
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient  patient;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_id")
	private Clinic  clinic;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private Doctor  doctor;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "previous_treatment_id")
	private PreviousTreatment previousTreatment;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_branch_id")
	private ClinicBranch clinicBranch;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prescriptionId;
	
	
	private String prescriptionText;
	
	private String prescriptionDateAndTime; 
	
	
	private Date prescriptionCreateDateAndTime;
	
	private String prescriptionFollowupDateAndTime;
	
	private String prescriptionDosage;
	
	private String prescriptionDignosis;
	
	
	 @ApiModelProperty(required = false, hidden = true)
	 private boolean isActive;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {  
		this.clinic = clinic;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public PreviousTreatment getPreviousTreatment() {
		return previousTreatment;
	}

	public void setPreviousTreatment(PreviousTreatment previousTreatment) {
		this.previousTreatment = previousTreatment;
	}

	public ClinicBranch getClinicBranch() {
		return clinicBranch;
	}

	public void setClinicBranch(ClinicBranch clinicBranch) {
		this.clinicBranch = clinicBranch;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public String getPrescriptionText() {
		return prescriptionText;
	}

	public void setPrescriptionText(String prescriptionText) {
		this.prescriptionText = prescriptionText;
	}

	public String getPrescriptionDateAndTime() {
		return prescriptionDateAndTime;
	}

	public void setPrescriptionDateAndTime(String prescriptionDateAndTime) {
		this.prescriptionDateAndTime = prescriptionDateAndTime;
	}

	

	public Date getPrescriptionCreateDateAndTime() {
		return prescriptionCreateDateAndTime;
	}

	public void setPrescriptionCreateDateAndTime(Date prescriptionCreateDateAndTime) {
		this.prescriptionCreateDateAndTime = prescriptionCreateDateAndTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPrescriptionFollowupDateAndTime() {
		return prescriptionFollowupDateAndTime;
	}

	public void setPrescriptionFollowupDateAndTime(String prescriptionFollowupDateAndTime) {
		this.prescriptionFollowupDateAndTime = prescriptionFollowupDateAndTime;
	}

	public String getPrescriptionDosage() {
		return prescriptionDosage;
	}

	public void setPrescriptionDosage(String prescriptionDosage) {
		this.prescriptionDosage = prescriptionDosage;
	}

	public String getPrescriptionDignosis() {
		return prescriptionDignosis;
	}

	public void setPrescriptionDignosis(String prescriptionDignosis) {
		this.prescriptionDignosis = prescriptionDignosis;
	}

	@Override
	public String toString() {
		return "Prescription [patient=" + patient + ", clinic=" + clinic + ", doctor=" + doctor + ", previousTreatment="
				+ previousTreatment + ", clinicBranch=" + clinicBranch + ", prescriptionId=" + prescriptionId
				+ ", prescriptionText=" + prescriptionText + ", prescriptionDateAndTime=" + prescriptionDateAndTime
				+ ", prescriptionCreateDateAndTime=" + prescriptionCreateDateAndTime
				+ ", prescriptionFollowupDateAndTime=" + prescriptionFollowupDateAndTime + ", prescriptionDosage="
				+ prescriptionDosage + ", prescriptionDignosis=" + prescriptionDignosis + "]";
	}
	
	

}
