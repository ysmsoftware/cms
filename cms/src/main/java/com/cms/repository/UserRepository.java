package com.cms.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.cms.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE User c SET c.isActive = :isActive WHERE c.userId = :userId")
	public void changeUserActivationStatus(int userId, boolean isActive);
	
	
	@Query("select u from User u where u.userId = :userId")
	public User getUserByUserId(int userId);
	
}
