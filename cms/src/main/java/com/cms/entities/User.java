package com.cms.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

    private String userMobileNumberAsUsername;
   
	

	public Role getRole() {
		return role;
	}



	public void setRole(Role role) {
		this.role = role;
	}

	private String userPassword1Readable;
    private String userPassword1Encrypted;
    private String userType; // admin, doctor, reception, etc.
    private String userPassword; // encrypted password
    private Date userCreated;

    @OneToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
    
    @Enumerated(EnumType.STRING)
    private Role role; // Role enum

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public User(int userId, String userMobileNumber, String userPassword1Readable, String userPassword1Encrypted,
			String userType, String userPassword, Date userCreated, Staff staff, Role role) {
		super();
		this.userId = userId;
		
		this.userPassword1Readable = userPassword1Readable;
		this.userPassword1Encrypted = userPassword1Encrypted;
		this.userType = userType;
		this.userPassword = userPassword;
		this.userCreated = userCreated;

		this.role = role;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserPassword1Readable() {
		return userPassword1Readable;
	}

	public void setUserPassword1Readable(String userPassword1Readable) {
		this.userPassword1Readable = userPassword1Readable;
	}

	public String getUserPassword1Encrypted() {
		return userPassword1Encrypted;
	}
	
	 public String getUserMobileNumberAsUsername() {
			return userMobileNumberAsUsername;
		}



		public void setUserMobileNumberAsUsername(String userMobileNumberAsUsername) {
			this.userMobileNumberAsUsername = userMobileNumberAsUsername;
		}

	public void setUserPassword1Encrypted(String userPassword1Encrypted) {
		this.userPassword1Encrypted = userPassword1Encrypted;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserPassword() {
		return userPassword;
	}
	
	

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Staff getStaff() {
		return staff;
	}



	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Date getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}

	
	
    
}
