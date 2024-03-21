package com.cms.repository;



import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.cms.entities.Clinic;


@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer>{
	
	@Query("select u from Clinic u where u.clinicId = :clinicId")
	public Clinic getClinicByClinicId(@Param("clinicId") int clinicId);
	
	
	@Transactional
	@Modifying
	@Query("UPDATE Clinic c SET c.isActive = :isActive WHERE c.id = :clinicId")
	public void updateClinicStatus(@Param("clinicId") int clinicId, @Param("isActive") boolean isActive);

}



