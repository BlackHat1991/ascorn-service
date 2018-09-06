package com.ascorn.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ascorn.service.model.CompanyRegistration;
import com.ascorn.service.rest.service.CompanyRegistrationService;

@RestController
@RequestMapping("company-registration/")
public class CompanyRegistrationController {
	
	@Autowired
	private CompanyRegistrationService companyRegistrationService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<CompanyRegistration>> listAllRecords() {
		List<CompanyRegistration> companyRegistrations = companyRegistrationService.listAllRecords();
		return new ResponseEntity<List<CompanyRegistration>>(companyRegistrations, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<CompanyRegistration> createRecord(@RequestBody CompanyRegistration companyRegistration) {
		companyRegistration = companyRegistrationService.create(companyRegistration);
		return new ResponseEntity<CompanyRegistration>(companyRegistration, HttpStatus.OK);
	}

}
