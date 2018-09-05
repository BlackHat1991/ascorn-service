package com.ascorn.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascorn.service.model.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long>  {
	 ApplicationUser findByUsername(String username);
}
