package com.cms.entities;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class ClinicBranch {
	
	public ClinicBranch() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(required = false, hidden = true)
	private int clinicBranchId;

	   
	private String clinicBranchName;

    private String clinicBranchType;

    private String clinicBranchLocation;

    private String clinicBranchContactNumber1;

  	private String clinicBranchContactNumber2;

    private String clinicBranchEmail;

    private String clinicBranchLocationLatitude;
	
    private String clinicBranchLocationLongitude;

    private Date clinicBranchEstablishedDate;
	
    @ApiModelProperty(required = false, hidden = true)
    private Date clinicBranchCreated;

    @ApiModelProperty(required = false, hidden = true)
    private boolean clinicBranchIsActive;

	@Transient
    private int tempClinicId;
	
    @ApiModelProperty(required = false, hidden = true)
    private boolean isActive;

    @ApiModelProperty(required = false,hidden = true)
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_id")
	private Clinic clinic;

	public int getClinicBranchId() {
		return clinicBranchId;
	}

	public void setClinicBranchId(int clinicBranchId) {
		this.clinicBranchId = clinicBranchId;
	}
	
	public int getTempClinicId() {
		return tempClinicId;
	}

	public void setTempClinicId(int tempClinicId) {
		this.tempClinicId = tempClinicId;
	}


	public String getClinicBranchName() {
		return clinicBranchName;
	}

	public void setClinicBranchName(String clinicBranchName) {
		this.clinicBranchName = clinicBranchName;
	}

	public String getClinicBranchType() {
		return clinicBranchType;
	}

	public void setClinicBranchType(String clinicBranchType) {
		this.clinicBranchType = clinicBranchType;
	}

	public String getClinicBranchLocation() {
		return clinicBranchLocation;
	}

	public void setClinicBranchLocation(String clinicBranchLocation) {
		this.clinicBranchLocation = clinicBranchLocation;
	}

	public String getClinicBranchContactNumber1() {
		return clinicBranchContactNumber1;
	}

	public void setClinicBranchContactNumber1(String clinicBranchContactNumber1) {
		this.clinicBranchContactNumber1 = clinicBranchContactNumber1;
	}

	public String getClinicBranchContactNumber2() {
		return clinicBranchContactNumber2;
	}

	public void setClinicBranchContactNumber2(String clinicBranchContactNumber2) {
		this.clinicBranchContactNumber2 = clinicBranchContactNumber2;
	}

	public String getClinicBranchEmail() {
		return clinicBranchEmail;
	}

	public void setClinicBranchEmail(String clinicBranchEmail) {
		this.clinicBranchEmail = clinicBranchEmail;
	}

	public String getClinicBranchLocationLatitude() {
		return clinicBranchLocationLatitude;
	}

	public void setClinicBranchLocationLatitude(String clinicBranchLocationLatitude) {
		this.clinicBranchLocationLatitude = clinicBranchLocationLatitude;
	}

	public String getClinicBranchLocationLongitude() {
		return clinicBranchLocationLongitude;
	}

	public void setClinicBranchLocationLongitude(String clinicBranchLocationLongitude) {
		this.clinicBranchLocationLongitude = clinicBranchLocationLongitude;
	}

	public Date getClinicBranchEstablishedDate() {
		return clinicBranchEstablishedDate;
	}

	public void setClinicBranchEstablishedDate(Date clinicBranchEstablishedDate) {
		this.clinicBranchEstablishedDate = clinicBranchEstablishedDate;
	}

	public Date getClinicBranchCreated() {
		return clinicBranchCreated;
	}

	public void setClinicBranchCreated(Date clinicBranchCreated) {
		this.clinicBranchCreated = clinicBranchCreated;
	}


	public boolean isClinicBranchIsActive() {
		return clinicBranchIsActive;
	}

	public boolean isActive() {
		return isActive;

	}


	public void setClinicBranchIsActive(boolean clinicBranchIsActive) {
		this.clinicBranchIsActive = clinicBranchIsActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;

	}


		
	/*
	 * public Integer getClinicId() { // Check if clinic is not null, then return
	 * its ID return (clinic != null) ? clinic.getClinicId() : null; }
	 */
	  
	
}

    
    
    
    



