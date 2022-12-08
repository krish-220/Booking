package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Admin;
import com.example.customer.repository.AdminRepository;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		return adminRepository.findAll();
		}

}
