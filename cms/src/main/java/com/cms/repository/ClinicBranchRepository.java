package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entities.ClinicBranch;

@Repository
public interface ClinicBranchRepository extends JpaRepository<ClinicBranch, Integer>{
	

}
