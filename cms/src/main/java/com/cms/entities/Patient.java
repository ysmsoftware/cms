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
import javax.persistence.Transient;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Patient {

	public Patient() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(required = false, hidden = true)
	private int patientId;

	@Column(length = 100)
	private String patientName;
	@Column(length = 500)
	private String patientAddress;
	@Column(length = 700)
	private String patientMedicalHistory;
	private String patientGender;
	private String patientDob;
	@Column(length = 50)
	private String patientEmail;
	
	 @ApiModelProperty(required = false, hidden = true)
	 private boolean isActive;

	@ApiModelProperty(required = false, hidden = true)
	private Date patientCreatedDateTime;
	
	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_id")
	private Clinic clinic;

	@ApiModelProperty(required = false, hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_branch_id")
	private ClinicBranch clinicBranch;
	
	
	@Transient
    private int tempClinicId;
	

	@Transient
    private int tempClinicBranchId;
	
	
	
	
	

	public int getTempClinicBranchId() {
		return tempClinicBranchId;
	}

	public void setTempClinicBranchId(int tempClinicBranchId) {
		this.tempClinicBranchId = tempClinicBranchId;
	}

	public int getTempClinicId() {
		return tempClinicId;
	}

	public void setTempClinicId(int tempClinicId) {
		this.tempClinicId = tempClinicId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientMedicalHistory() {
		return patientMedicalHistory;
	}

	public void setPatientMedicalHistory(String patientMedicalHistory) {
		this.patientMedicalHistory = patientMedicalHistory;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientDob() {
		return patientDob;
	}

	public void setPatientDob(String patientDob) {
		this.patientDob = patientDob;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	

	public Date getPatientCreatedDateTime() {
		return patientCreatedDateTime;
	}

	public void setPatientCreatedDateTime(Date patientCreatedDateTime) {
		this.patientCreatedDateTime = patientCreatedDateTime;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public ClinicBranch getClinicBranch() {
		return clinicBranch;
	}

	public void setClinicBranch(ClinicBranch clinicBranch) {
		this.clinicBranch = clinicBranch;
	}

	

}
