package com.cognixia.group4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.group4.model.Budget;
import com.cognixia.group4.service.BudgetService;

import jakarta.validation.Valid;

@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class BudgetController {
	
	@Autowired
	BudgetService service;
	
	@GetMapping("/budget")
	public List<Budget> getBudgets() {
		return service.getBudgets();
	}
	
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
