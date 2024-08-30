package com.ojulari.regiser_api_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojulari.register_api_demo.model.Employee;

@RestController
@RequestMapping("/register")
public class Reg_Controller {
	
	Employee model;
		
	@GetMapping("{full_name}")
	public Employee getUserDetails(String full_name) {
		return model;
	}
	
	@PostMapping
	public String createUserDetails (@RequestBody Employee model) {
		this.model = model;
		return "User Created Successfuly";
		
	}
	
	@PutMapping
	public String updateUserDetails (@RequestBody Employee model) {
		this.model = model;
		return "User Updated Successfuly";
		
	}
}
