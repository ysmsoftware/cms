package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cms.entities.Allergies;
import com.cms.entities.Appointment;
import com.cms.entities.Patient;
import com.cms.entities.PreviousTreatment;


@Repository
public interface PreviousTreatmentRepository extends JpaRepository<PreviousTreatment , Integer> {
	
	
	@Query("select u from PreviousTreatment u where u.previousTreatmentId = :previousTreatmentId")
	public PreviousTreatment getPreviousTreatmentByPreviousTreatment(int previousTreatmentId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE PreviousTreatment a SET a.isActive = :isActive WHERE a.previousTreatmentId = :previousTreatmentId")
	public void changePreviousTreatmentActivationStatus(int previousTreatmentId, boolean isActive);
	

}
