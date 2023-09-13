package com.cognixia.group4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.group4.model.Budget;
import com.cognixia.group4.service.BudgetService;

import jakarta.validation.Valid;

@RequestMapping("/api")
@RestController
public class BudgetController {
	
	@Autowired
	BudgetService service;
	
	@PostMapping("/budget")
	public ResponseEntity<?> createBudget(@Valid @RequestBody Budget budgetRequest) {
		
		try {
			ResponseEntity<Budget> created = service.createBudget(budgetRequest);
            return ResponseEntity.status(201).body(created);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error creating budget");
        }

	}
}
