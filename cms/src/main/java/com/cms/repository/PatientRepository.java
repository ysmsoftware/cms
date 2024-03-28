package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cms.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	@Query("select u from Patient u where u.patientId = :patientId")
	public Patient getPatientByPatientId(int patientId);
	
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Patient p SET p.isActive = :isActive WHERE p.patientId = :patientId")
	public void changePatientActivationStatus(int patientId, boolean isActive);
	
}
