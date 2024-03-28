package com.cms.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(required = false, hidden = true)
	private int userId;
	
    private String userName;
    
    private String userPassword;
    
   	private String userRole; 
   	
    private Date userCreated;
    
    @ApiModelProperty(required = false, hidden = true)
    private boolean isActive;
    
    @JsonManagedReference
    @OneToOne
    @JoinColumn(name="staff_id")
    private Staff staff;
    

    /*@JsonBackReference
    @OneToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;*/

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userName, String userPassword, String userRole, Date userCreated, boolean isActive,
			Staff staff) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userCreated = userCreated;
		this.isActive = isActive;
		this.staff = staff;
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Date getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	
}
