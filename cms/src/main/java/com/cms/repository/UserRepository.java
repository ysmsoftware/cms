package com.cms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cms.entities.User;


@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("select u from User u where u.mobile = :mobile")
	public User getUserByUserName(@Param("mobile") String mobile);
	
	
	 
	 
}
