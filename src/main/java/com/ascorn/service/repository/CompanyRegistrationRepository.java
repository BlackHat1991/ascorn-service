package com.ascorn.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascorn.service.model.CompanyRegistration;

public interface CompanyRegistrationRepository extends JpaRepository<CompanyRegistration, Long> {

}
