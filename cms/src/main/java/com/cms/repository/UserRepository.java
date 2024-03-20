package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	
}
