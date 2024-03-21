package com.cms.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cms.entities.Clinic;


@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer>{
	
	@Query("select u from Clinic u where u.clinicId = :clinicId")
	public Clinic getClinicByClinicId(@Param("clinicId") int clinicId);
		
	

}



