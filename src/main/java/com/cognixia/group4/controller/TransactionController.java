package com.cognixia.group4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.group4.model.Transaction;
import com.cognixia.group4.service.TransactionService;

import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@GetMapping("/transaction")
	public List<Transaction> getTransactions() {
		return service.getTransactions();
	}
	
	@PostMapping("/transaction")
	public ResponseEntity<?> createTransaction(@Valid @RequestBody Transaction transaction) {
		try {
			ResponseEntity<Transaction> created = service.createTransaction(transaction);
			return ResponseEntity.status(201).body(created);
			
		} catch (Exception e) {
		return ResponseEntity.status(403).body("Error creating transaction");
		}
	}
}
