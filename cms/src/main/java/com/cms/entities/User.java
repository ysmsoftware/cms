package com.cms.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User{
	
	public User() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@OneToOne
	@JoinColumn(name = "staff_id")
	private Staff staff;

	@Column(name="user_name")
	private String  name;
	
	@Column(name="mobile_number")
	private String  mobile;
	
	@Column(name="user_enabled")
	private boolean enabled;
	
	@Column(name="user_password")
	private String  password;
	
	@Column(name="user_password_read")
	private String  userPasswordRead;
	
	@Column(name="user_role")
	private String  role;
	
	@Column(name="type", unique=true)
	private String  type;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserPasswordRead() {
		return userPasswordRead;
	}

	public void setUserPasswordRead(String userPasswordRead) {
		this.userPasswordRead = userPasswordRead;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", staff=" + staff + ", name=" + name + ", mobile=" + mobile + ", enabled="
				+ enabled + ", password=" + password + ", userPasswordRead=" + userPasswordRead + ", role=" + role
				+ ", type=" + type + "]";
	}
   
	
	
	


	
	
    
}
