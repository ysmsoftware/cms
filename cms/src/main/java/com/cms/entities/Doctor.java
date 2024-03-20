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

}
