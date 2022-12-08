package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Feedback;
import com.example.customer.repository.FeedbackRepository;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {
	
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	@PostMapping("/Feedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	
	@GetMapping("/Feedback")
	public List<Feedback> getAllFeedback(){
		return feedbackRepository.findAll();
	}
}
