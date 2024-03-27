package com.cms.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cms.entities.Appointment;
import com.cms.entities.Patient;


@Repository
public interface AppointmentRepository extends JpaRepository<Appointment , Integer> {
	
	
	@Query("select u from Appointment u where u.appointmentId = :appointmentId")
	public Appointment getAppointmentByAppointmenttId(int appointmentId);
	
	@Transactional
	@Modifying
	@Query(value = "UPDATE Appointment a SET a.isActive = :isActive WHERE a.appointmentId = :appointmentId")
	public void changePatientActivationStatus(int appointmentId, boolean isActive);
	

}
