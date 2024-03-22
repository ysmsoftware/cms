package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cms.entities.Clinic;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer>{
	
	@Query("select u from Clinic u where u.clinicId = :clinicId")
	public Clinic getClinicByClinicId(int clinicId);
	
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Clinic c SET c.isActive = :isActive WHERE c.clinicId = :clinicId")
	public void changeClinicActivationStatus(int clinicId, boolean isActive);

}