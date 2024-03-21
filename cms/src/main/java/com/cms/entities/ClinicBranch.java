package com.cms.entities;



import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class ClinicBranch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty
	private int clinicBranchId;
	
	
   
	//private int clinicID;		//foreign key
	@ApiModelProperty
	private String clinicBranchName;
	@ApiModelProperty
    private String clinicType;
	@ApiModelProperty
    private String clinicBranchLocation;
	@ApiModelProperty
    private String clinicContactNumber1;
	@ApiModelProperty
  	private String clinicContactNumber2;
	@ApiModelProperty
    private String clinicEmail;
	@ApiModelProperty
    private String clinicLocationLatitude;
	
	@ApiModelProperty
    private String clinicLocationLongitude;
	@ApiModelProperty
    private Date clinicEstablishedDate;
	@ApiModelProperty
    private Date clinicBranchCreated;
	@ApiModelProperty
    private boolean clinicBranchIsActive;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinic_id")
	private Clinic clinic;
	
	
	  public Integer getClinicId() {
	        // Check if clinic is not null, then return its ID
	        return (clinic != null) ? clinic.getClinicId() : null;
		 
	    }
	  

	    public Clinic getClinic() {
		return clinic;
	}


		public void setClinic(Clinic clinic) {
	        this.clinic = clinic;
	    }
   
	public ClinicBranch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getClinicBranchId() {
		return clinicBranchId;
	}


	public void setClinicBranchId(int clinicBranchId) {
		this.clinicBranchId = clinicBranchId;
	}

	public String getClinicBranchName() {
		return clinicBranchName;
	}


	public void setClinicBranchName(String clinicBranchName) {
		this.clinicBranchName = clinicBranchName;
	}
	

	

	public String getClinicType() {
		return clinicType;
	}


	public void setClinicType(String clinicType) {
		this.clinicType = clinicType;
	}


	public String getClinicBranchLocation() {
		return clinicBranchLocation;
	}


	public void setClinicBranchLocation(String clinicBranchLocation) {
		this.clinicBranchLocation = clinicBranchLocation;
	}


	public String getClinicContactNumber1() {
		return clinicContactNumber1;
	}


	public void setClinicContactNumber1(String clinicContactNumber1) {
		this.clinicContactNumber1 = clinicContactNumber1;
	}


	public String getClinicContactNumber2() {
		return clinicContactNumber2;
	}


	public void setClinicContactNumber2(String clinicContactNumber2) {
		this.clinicContactNumber2 = clinicContactNumber2;
	}


	public String getClinicEmail() {
		return clinicEmail;
	}


	public void setClinicEmail(String clinicEmail) {
		this.clinicEmail = clinicEmail;
	}


	public String getClinicLocationLatitude() {
		return clinicLocationLatitude;
	}


	public void setClinicLocationLatitude(String clinicLocationLatitude) {
		this.clinicLocationLatitude = clinicLocationLatitude;
	}


	public String getClinicLocationLongitude() {
		return clinicLocationLongitude;
	}


	public void setClinicLocationLongitude(String clinicLocationLongitude) {
		this.clinicLocationLongitude = clinicLocationLongitude;
	}


	public Date getClinicEstablishedDate() {
		return clinicEstablishedDate;
	}


	public void setClinicEstablishedDate(Date clinicEstablishedDate) {
		this.clinicEstablishedDate = clinicEstablishedDate;
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


	public void setClinicBranchIsActive(boolean clinicBranchIsActive) {
		this.clinicBranchIsActive = clinicBranchIsActive;
	}
    
	

}
