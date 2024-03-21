package com.cms.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
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
    public String getRole() {
		return role;
	}






	public void setRole(String role) {
		this.role = role;
	}

	private String role; // Role enum
	private String userPassword1Readable;
    private String userPassword1Encrypted;
    private String userType; // admin, doctor, reception, etc.
    private String userPassword; // encrypted password
    private Date userCreated;

	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "staff_id") private Staff staff;
	 */
    
   

	public User() {
		super();
		// TODO Auto-generated constructor stub
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


	public Date getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}

	
	
    
}
