package com.cms.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Staff 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;

    private String staffRole;
  
	private String userType;
    private String staffFirstName;
    private String staffLastName;
    private String staffGender;
    private Date staffDateOfBirth;
    private String staffMobileNumber;
    private String staffQualifications;
    private String staffWorkSchedule;
    private String staffPassword;
    private String staffAccessRights; // read only, full access, limited access

   
    public User getUser() {
		return user;
	}



	public String getStaffPassword() {
		return staffPassword;
	}



	public void setStaffPassword(String staffPassword) {
		this.staffPassword = staffPassword;
	}
	
	  public String getUserType() {
			return userType;
		}



		public void setUserType(String userType) {
			this.userType = userType;
		}




	public void setUser(User user) {
		this.user = user;
	}

	@OneToOne(mappedBy = "staff")
    private User user;
    

    private Date joiningDate;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Staff(int staffId, String staffRole, String staffFirstName, String staffLastName, String staffGender,
			Date staffDateOfBirth, String staffContactNumber, String staffQualifications, String staffWorkSchedule,
			String staffAccessRights, User user, Date joiningDate) {
		super();
		this.staffId = staffId;
		this.staffRole = staffRole;
		this.staffFirstName = staffFirstName;
		this.staffLastName = staffLastName;
		this.staffGender = staffGender;
		this.staffDateOfBirth = staffDateOfBirth;

		this.staffQualifications = staffQualifications;
		this.staffWorkSchedule = staffWorkSchedule;
		this.staffAccessRights = staffAccessRights;
		
		this.joiningDate = joiningDate;
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

	public String getStaffAccessRights() {
		return staffAccessRights;
	}

	public void setStaffAccessRights(String staffAccessRights) {
		this.staffAccessRights = staffAccessRights;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
    
    
}
