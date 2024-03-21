package com.cms.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.repository.ClinicBranchRepository;
import com.cms.repository.ClinicRepository;


@Service
public class ClinicBranchService {
	
	 	@Autowired(required = true)
	    private ClinicBranchRepository clinicBranchRepository;
	 	
	 	@Autowired(required = true)
	 	private ClinicRepository clinicRepository;

	
	    public ClinicBranch addClinicBranch(ClinicBranch clinicBranch) 
	    {
	        return clinicBranchRepository.save(clinicBranch);
	    }
	    
	    public List<ClinicBranch> getClinicBranch()
	    {
	    	List clinicBranchList =clinicBranchRepository.findAll();
	    	return clinicBranchList;
	    	
	    }
		
		public void deleteClinicBranch(int parseInt) 
		{
			// TODO Auto-generated method stub
		ClinicBranch entity=	clinicBranchRepository.getOne(parseInt);
		clinicBranchRepository.deleteById(parseInt);
		
		} 
		

		public ClinicBranch updateClinicBranch(ClinicBranch clinicBranch) {
			// TODO Auto-generated method stub
			clinicBranchRepository.save(clinicBranch);
			return clinicBranch;
			
		}
		
		
	
}
