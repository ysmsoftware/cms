package com.cms.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Doctor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorId;

    private Date doctorCreated;
    
    private String doctorFirstName;
    
    private String doctorLastName;
    
    private String doctorGender;
    
    private Date doctorDateOfBirth;
    
    private String doctorContactNumber;
    
    private String doctorQualifications;
    
    private String doctorWorkSchedule;
    
    private String doctorSpeciality;
    
    private String doctorEmail;
    
    private String licenseNumber;
    
    private Date graduationDate;
    
    private Date joiningDate;
    
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public Date getDoctorCreated() {
		return doctorCreated;
	}
	public void setDoctorCreated(Date doctorCreated) {
		this.doctorCreated = doctorCreated;
	}
	public String getDoctorFirstName() {
		return doctorFirstName;
	}
	public void setDoctorFirstName(String doctorFirstName) {
		this.doctorFirstName = doctorFirstName;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public Date getDoctorDateOfBirth() {
		return doctorDateOfBirth;
	}
	public void setDoctorDateOfBirth(Date doctorDateOfBirth) {
		this.doctorDateOfBirth = doctorDateOfBirth;
	}
	public String getDoctorContactNumber() {
		return doctorContactNumber;
	}
	public void setDoctorContactNumber(String doctorContactNumber) {
		this.doctorContactNumber = doctorContactNumber;
	}
	public String getDoctorQualifications() {
		return doctorQualifications;
	}
	public void setDoctorQualifications(String doctorQualifications) {
		this.doctorQualifications = doctorQualifications;
	}
	public String getDoctorWorkSchedule() {
		return doctorWorkSchedule;
	}
	public void setDoctorWorkSchedule(String doctorWorkSchedule) {
		this.doctorWorkSchedule = doctorWorkSchedule;
	}
	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}
	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public Date getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
    

}
