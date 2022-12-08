package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping

public class CustomerController {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/getcust")
		public List<Customer> getAll(){
			return customerRepository.findAll();
		}
	
	
	@PostMapping("/getcust")
	public Customer getUser( @RequestBody Customer cust) {
		 return customerRepository.save(cust);
		/*Customer customerr=customerRepository.findByUserId(cust.getUserId());
	System.out.print(customerr.getPassword()+" "+cust.getPassword());
		   if(customerr.getPassword().equals(cust.getPassword())) {
			   
			   return ResponseEntity.ok(customerr);
		   }
		    
			   return (ResponseEntity<?>) ResponseEntity.internalServerError();*/
		
		
		
	}

}
