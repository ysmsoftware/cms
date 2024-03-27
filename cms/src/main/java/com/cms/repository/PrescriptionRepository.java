package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.entities.Prescription;
import com.cms.entities.PreviousTreatment;


@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription , Integer> {
	
	
	@Query("select u from Prescription u where u.prescriptionId = :prescriptionId")
	public Prescription getPrescriptionByPrescriptionId(int prescriptionId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Prescription a SET a.isActive = :isActive WHERE a.prescriptionId = :prescriptionId")
	public void changePrescriptionActivationStatus(int prescriptionId, boolean isActive);
	

}
