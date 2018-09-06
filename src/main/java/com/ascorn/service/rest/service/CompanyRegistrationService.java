package com.ascorn.service.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ascorn.service.model.CompanyRegistration;
import com.ascorn.service.repository.CompanyRegistrationRepository;

@Service("companyRegistrationService")
public class CompanyRegistrationService {
	
	@Autowired
	CompanyRegistrationRepository companyRegistrationRepository;
	
	public List<CompanyRegistration> listAllRecords () {
		List<CompanyRegistration> companyRegistrations = companyRegistrationRepository.findAll();
		return companyRegistrations;
	}
	
	public CompanyRegistration create(CompanyRegistration companyRegistration) {
		companyRegistration = companyRegistrationRepository.save(companyRegistration);
		return companyRegistration;
	}

}
