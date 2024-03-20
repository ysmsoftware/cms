package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.repository.ClinicRepository;




@Service
public class ClinicService 
{
	@Autowired(required = true)
    private ClinicRepository clinicRepository;


    public Clinic addClinic(Clinic clinic) 
    {
        return clinicRepository.save(clinic);
    }
    
    public List<Clinic> getClinic()
    {
    	List clinicBranchList =clinicRepository.findAll();
    	return clinicBranchList;
    	
    }
    
    public void deleteClinic(int parseInt) 
	{
		// TODO Auto-generated method stub
	Clinic entity=	clinicRepository.getOne(parseInt);
	clinicRepository.deleteById(parseInt);
	
	} 
	 
   
	public Clinic updateClinic(Clinic clinic) {
		// TODO Auto-generated method stub
		clinicRepository.save(clinic);
		return clinic;
		
	}
	

	/*
	 * public Clinic getClinic(int clinicId) {
	 * 
	 * return clinicRepository.getOne(clinicId); }
	 */

	

	
    
    
}
