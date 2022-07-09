package com.bhagi.UserManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhagi.UserManagement.Entity.Customers;
import com.bhagi.UserManagement.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getAll")
	public HttpEntity<Object> getAllUsers(){
		List<Customers> listCustomers = userService.getAllCustomers();
		return new ResponseEntity<>(listCustomers, HttpStatus.FOUND);
	}

}
