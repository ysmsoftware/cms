package com.cms.entities;

import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@JsonIdentityInfo(generator =ObjectIdGenerators.PropertyGenerator.class, property = "clinicId")

public class Clinic {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	  	private int clinicId;
	
	    private String clinicName;
	
	    private String clinicType;
		
	    private String clinicLocation;
	
	    private String clinicContactNumber;

	    private String clinicEmail;
		
	    private Date clinicCreated;
	
	    private boolean clinicIsActive;
		
	
	    
	
		public Clinic() {
			super();
			// TODO Auto-generated constructor stub
		}


		public int getClinicId() {
			return clinicId;
		}


		public void setClinicId(int clinicId) {
			this.clinicId = clinicId;
		}


		public String getClinicName() {
			return clinicName;
		}


		public void setClinicName(String clinicName) {
			this.clinicName = clinicName;
		}


		public String getClinicType() {
			return clinicType;
		}


		public void setClinicType(String clinicType) {
			this.clinicType = clinicType;
		}


		public String getClinicLocation() {
			return clinicLocation;
		}


		public void setClinicLocation(String clinicLocation) {
			this.clinicLocation = clinicLocation;
		}


		public String getClinicContactNumber() {
			return clinicContactNumber;
		}


		public void setClinicContactNumber(String clinicContactNumber) {
			this.clinicContactNumber = clinicContactNumber;
		}


		public String getClinicEmail() {
			return clinicEmail;
		}


		public void setClinicEmail(String clinicEmail) {
			this.clinicEmail = clinicEmail;
		}


		public Date getClinicCreated() {
			return clinicCreated;
		}


		public void setClinicCreated(Date clinicCreated) {
			this.clinicCreated = clinicCreated;
		}


		public boolean isClinicIsActive() {
			return clinicIsActive;
		}


		public void setClinicIsActive(boolean clinicIsActive) {
			this.clinicIsActive = clinicIsActive;
		}


	

		
		
		
		

		

	
	    
}
