package com.cms.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.cms.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
	
	@Query("select u from Staff u where u.staffId = :staffId")
	public Staff getStaffByStaffId(int staffId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Staff c SET c.isActive = :isActive WHERE c.staffId = :staffId")
	public void changeStaffActivationStatus(int staffId, boolean isActive);
	
}
