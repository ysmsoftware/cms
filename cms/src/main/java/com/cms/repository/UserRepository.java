package com.cms.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cms.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("select u from User u where u.userMobileNumber = :mobile")
	public User getUserByUserName(@Param("mobile") String mobile);
}
