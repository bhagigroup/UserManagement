package com.bhagi.UserManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhagi.UserManagement.Entity.Customers;
import com.bhagi.UserManagement.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	public List<Customers> getAllCustomers(){
	
		List<Customers> customerList = userRepo.findAll();
		
		return customerList;
	}
}
