package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cms.entities.Allergies;
import com.cms.entities.Appointment;
import com.cms.entities.Patient;


@Repository
public interface AllergiesRepository extends JpaRepository<Allergies , Integer> {
	
	
	@Query("select u from Allergies u where u.allergyId = :allergyId")
	public Allergies getAllergiesByAllergyId(int allergyId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Allergies a SET a.isActive = :isActive WHERE a.allergyId = :allergyId")
	public void changeAllergiesActivationStatus(int allergyId, boolean isActive);
	

}
