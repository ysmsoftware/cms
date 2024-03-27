package com.cms.entities;

import java.sql.Date;
import java.util.ArrayList;
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
	
		public Clinic() {
			super();			
		}
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)		
		@ApiModelProperty(required = false, hidden = true)
	  	private int clinicId;
	
		private String clinicName;
		  
		private String clinicType;
		
	    private String clinicLocation;
	    
	    private String clinicLocationLatitude;
		
	    private String clinicLocationLongitude;
	
	    private String clinicContactNumber1;

	  	private String clinicContactNumber2;
	  	
	    private Date clinicEstablishedDate;    

	    private String clinicEmail;
		
	    @ApiModelProperty(required = false, hidden = true)
	    private Date clinicCreated;
	
	    @ApiModelProperty(required = false, hidden = true)
	    private boolean isActive;
	  
	    @ApiModelProperty(required = false, hidden = true)
		@OneToMany(mappedBy = "clinic", cascade = CascadeType.ALL)
	 	private List<ClinicBranch> clinicBranch=new ArrayList<>();
	    
	    public void addClinicBranch(ClinicBranch clinicBranch1) {
	    	
	    	clinicBranch.add(clinicBranch1); 
	    	clinicBranch1.setClinic(this); 
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

		public Date getClinicEstablishedDate() {
			return clinicEstablishedDate;
		}

		public void setClinicEstablishedDate(Date clinicEstablishedDate) {
			this.clinicEstablishedDate = clinicEstablishedDate;
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

		public boolean isActive() {
			return isActive;
		}

		public void setActive(boolean isActive) {
			this.isActive = isActive;
		}

		public List<ClinicBranch> getClinicBranch() {
			return clinicBranch;
		}

		public void setClinicBranch(List<ClinicBranch> clinicBranch) {
			this.clinicBranch = clinicBranch;
		}
	
	    
	    
}
