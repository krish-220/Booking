package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Booking;
import com.example.customer.repository.BookingRepository;


@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@GetMapping("/createBooking")
	public List<Booking> getAllBookers(){
		return bookingRepository.findAll();
	}	
	
	
	@PostMapping("/createBooking")
	public Booking addBooking(@RequestBody Booking booking) {
		System.out.println(booking);
		return bookingRepository.save(booking);
	}
	
	

}
