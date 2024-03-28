package com.cms.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cms.entities.ClinicBranch;

@Repository
public interface ClinicBranchRepository extends JpaRepository<ClinicBranch, Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE ClinicBranch c SET c.isActive = :isActive WHERE c.clinicBranchId = :clinicBranchId")
	public void changeClinicBranchActivationStatus(int clinicBranchId, boolean isActive);
	
	
	@Query("select u from ClinicBranch u where u.clinicBranchId = :clinicBranchId")
	public ClinicBranch getClinicBranchByClinicBranchId(int clinicBranchId);
}
