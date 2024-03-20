package com.cms.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entities.Clinic;
import com.cms.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
	
	

}
