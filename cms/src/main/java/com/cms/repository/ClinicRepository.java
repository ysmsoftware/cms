package com.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cms.entities.Clinic;


@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer>{

}



