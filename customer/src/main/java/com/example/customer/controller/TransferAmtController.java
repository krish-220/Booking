package com.example.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.customer.model.TransferAmt;
import com.example.customer.repository.TransferAmtRepository;


@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class TransferAmtController {
	
	
	@Autowired
	private TransferAmtRepository transferAmtRepository;
	
	
	@PostMapping("/TransferAmt")
	public TransferAmt addAmtdetail(@RequestBody TransferAmt transfer) {
		
		return transferAmtRepository.save(transfer);
	}

}
