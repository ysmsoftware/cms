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
public class Allergies {

	public Allergies() {
	
	}
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private Patient  patient;
	
	 @ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "previous_treatment_id")
	private PreviousTreatment previousTreatment;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int allergyId;
	
	
	private String allergyName;
	
	private String allergyDescription; 
	
	
	private Date allergyCreateDateAndTime; 
	
	private String allergyOnDateAndTime;
	
	 @ApiModelProperty(required = false, hidden = true)
	 private boolean isActive;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PreviousTreatment getPreviousTreatment() {
		return previousTreatment;
	}

	public void setPreviousTreatment(PreviousTreatment previousTreatment) {
		this.previousTreatment = previousTreatment;
	}

	

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getAllergyId() {
		return allergyId;
	}

	public void setAllergyId(int allergyId) {
		this.allergyId = allergyId;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyDescription() {
		return allergyDescription;
	}

	public void setAllergyDescription(String allergyDescription) {
		this.allergyDescription = allergyDescription;
	}

	

	public Date getAllergyCreateDateAndTime() {
		return allergyCreateDateAndTime;
	}

	public void setAllergyCreateDateAndTime(Date allergyCreateDateAndTime) {
		this.allergyCreateDateAndTime = allergyCreateDateAndTime;
	}

	public String getAllergyOnDateAndTime() {
		return allergyOnDateAndTime;
	}

	public void setAllergyOnDateAndTime(String allergyOnDateAndTime) {
		this.allergyOnDateAndTime = allergyOnDateAndTime;
	}

	
	

	
	
	

}
