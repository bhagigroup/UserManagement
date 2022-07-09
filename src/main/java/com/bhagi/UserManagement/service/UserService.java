package com.bhagi.UserManagement.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhagi.UserManagement.Entity.Customers;
import com.bhagi.UserManagement.repo.UserRepo;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	UserRepo userRepo;
	
	public List<Customers> getAllCustomers(){
		logger.debug("getAllCustomers method called");
	
		List<Customers> customerList = userRepo.findAll();
		
		return customerList;
	}
}
