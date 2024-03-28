package com.cms.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.annotations.ApiModelProperty;

@Entity
public class Staff 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(required = false, hidden = true)
	private int staffId;
 
    private String staffRole;
    
  	private String staffFirstName;
  	
    private String staffLastName;
    
    private String staffGender;
    
    private Date staffDateOfBirth;
    
    private String staffMobileNumber;
    
    private String staffQualifications;
    
    private String staffWorkSchedule;
    
    private String staffPassword;
    
    private String staffAccessRights; // read only, full access, limited access
    
    private Date staffCreated;
    
    private String staffSpeciality;
    
    private String staffEmail;
    
    private String staffLicenseNumber;
    
    private Date staffGraduationDate;
    
    private Date staffJoiningDate;
    
    @ApiModelProperty(required = false, hidden = true)
    private boolean isActive;
    
    @JsonBackReference
    @OneToOne(mappedBy = "staff",cascade = CascadeType.ALL)
    @ApiModelProperty(required = false, hidden = true)
    private User user;
    
    public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

	public Staff(int staffId, String staffRole, String staffFirstName, String staffLastName, String staffGender,
			Date staffDateOfBirth, String staffMobileNumber, String staffQualifications, String staffWorkSchedule,
			String staffPassword, String staffAccessRights, Date staffCreated, String staffSpeciality,
			String staffEmail, String staffLicenseNumber, Date staffGraduationDate, Date staffJoiningDate,
			boolean isActive, User user) {
		super();
		this.staffId = staffId;
		this.staffRole = staffRole;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffGender = staffGender;
		this.staffDateOfBirth = staffDateOfBirth;
		this.staffMobileNumber = staffMobileNumber;
		this.staffQualifications = staffQualifications;
		this.staffWorkSchedule = staffWorkSchedule;
		this.staffPassword = staffPassword;
		this.staffAccessRights = staffAccessRights;
		this.staffCreated = staffCreated;
		this.staffSpeciality = staffSpeciality;
		this.staffEmail = staffEmail;
		this.staffLicenseNumber = staffLicenseNumber;
		this.staffGraduationDate = staffGraduationDate;
		this.staffJoiningDate = staffJoiningDate;
		this.isActive = isActive;
		this.user = user;
	}



	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getStaffRole() {
		return staffRole;
	}

	public void setStaffRole(String staffRole) {
		this.staffRole = staffRole;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public Date getStaffDateOfBirth() {
		return staffDateOfBirth;
	}

	public void setStaffDateOfBirth(Date staffDateOfBirth) {
		this.staffDateOfBirth = staffDateOfBirth;
	}

	public String getStaffMobileNumber() {
		return staffMobileNumber;
	}

	public void setStaffMobileNumber(String staffMobileNumber) {
		this.staffMobileNumber = staffMobileNumber;
	}

	public String getStaffQualifications() {
		return staffQualifications;
	}

	public void setStaffQualifications(String staffQualifications) {
		this.staffQualifications = staffQualifications;
	}

	public String getStaffWorkSchedule() {
		return staffWorkSchedule;
	}

	public void setStaffWorkSchedule(String staffWorkSchedule) {
		this.staffWorkSchedule = staffWorkSchedule;
	}

	public String getStaffPassword() {
		return staffPassword;
	}

	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}

	public String getStaffAccessRights() {
		return staffAccessRights;
	}

	public void setStaffAccessRights(String staffAccessRights) {
		this.staffAccessRights = staffAccessRights;
	}

	public Date getStaffCreated() {
		return staffCreated;
	}

	public void setStaffCreated(Date staffCreated) {
		this.staffCreated = staffCreated;
	}

	public String getStaffSpeciality() {
		return staffSpeciality;
	}

	public void setStaffSpeciality(String staffSpeciality) {
		this.staffSpeciality = staffSpeciality;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffLicenseNumber() {
		return staffLicenseNumber;
	}

	public void setStaffLicenseNumber(String staffLicenseNumber) {
		this.staffLicenseNumber = staffLicenseNumber;
	}

	public Date getStaffGraduationDate() {
		return staffGraduationDate;
	}

	public void setStaffGraduationDate(Date staffGraduationDate) {
		this.staffGraduationDate = staffGraduationDate;
	}

	public Date getStaffJoiningDate() {
		return staffJoiningDate;
	}

	public void setStaffJoiningDate(Date staffJoiningDate) {
		this.staffJoiningDate = staffJoiningDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffRole=" + staffRole + ", staffFirstName=" + staffFirstName
				+ ", staffLastName=" + staffLastName + ", staffGender=" + staffGender + ", staffDateOfBirth="
				+ staffDateOfBirth + ", staffMobileNumber=" + staffMobileNumber + ", staffQualifications="
				+ staffQualifications + ", staffWorkSchedule=" + staffWorkSchedule + ", staffPassword=" + staffPassword
				+ ", staffAccessRights=" + staffAccessRights + ", staffCreated=" + staffCreated + ", staffSpeciality="
				+ staffSpeciality + ", staffEmail=" + staffEmail + ", staffLicenseNumber=" + staffLicenseNumber
				+ ", staffGraduationDate=" + staffGraduationDate + ", staffJoiningDate=" + staffJoiningDate
				+ ", isActive=" + isActive + ", user=" + user + "]";
	}

   
}


