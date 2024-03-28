package com.cms.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cms.entities.Clinic;
import com.cms.entities.ClinicBranch;
import com.cms.repository.ClinicBranchRepository;

@Service
public class ClinicBranchService {
	
	 	@Autowired(required = true)
	    private ClinicBranchRepository clinicBranchRepository;
	 	
	 	@Autowired
	 	private ClinicService clinicService;
	 	
	 	@Transactional
	    public ClinicBranch addClinicBranch(ClinicBranch clinicBranch) {
	      	Clinic clinic=clinicService.getClinicById(clinicBranch.getTempClinicId());
	    	clinicBranch.setClinic(clinic);
	    	clinicBranch.setActive(true);
	    	clinicBranch.setClinicBranchCreated(new java.sql.Date(System.currentTimeMillis()));
	 	    return clinicBranchRepository.save(clinicBranch);
	    	
	     }
	    
	    @Transactional
		 public void changeClinicBranchActivationStatus(int clinicBranchId,boolean isActive) {
	    	clinicBranchRepository.changeClinicBranchActivationStatus(clinicBranchId,isActive);	        
		 }
	 	
	 	public List<ClinicBranch> getClinicBranch()
	    {
	    	List clinicBranchList =clinicBranchRepository.findAll();
	    	return clinicBranchList;
	    	
	    }
	 	
	 	public ClinicBranch getClinicBranchById(int clinicBranchId)
	 	{
	 		ClinicBranch clinicBranch= clinicBranchRepository.getClinicBranchByClinicBranchId(clinicBranchId);
			return clinicBranch;
	 		
	 	}
//		public void deleteClinicBranch(int parseInt) 
//		{
//			// TODO Auto-generated method stub
//		ClinicBranch entity=	clinicBranchRepository.getOne(parseInt);
//		clinicBranchRepository.deleteById(parseInt);
//		
//		} 
//		public ClinicBranch updateClinicBranch(ClinicBranch clinicBranch) {
//			// TODO Auto-generated method stub
//			clinicBranchRepository.save(clinicBranch);
//			return clinicBranch;
//			
//		}
	
}
