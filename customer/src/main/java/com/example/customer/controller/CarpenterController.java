package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Booking;
import com.example.customer.model.Carpenter;
import com.example.customer.repository.CarpenterRepository;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")
public class CarpenterController {
	
	
	
	@Autowired
	private CarpenterRepository carpenterRepository;
	
	
	@GetMapping("/Carpenters")
	public List<Carpenter> getAll(){
		return carpenterRepository.findAll();
	}
	
	@PostMapping("/Carpenters")
	public Carpenter addCarpenter(@RequestBody Carpenter carpenter) {
		System.out.println(carpenter);
		return carpenterRepository.save(carpenter);
	}
	
	
	
	
	
	
	

}
