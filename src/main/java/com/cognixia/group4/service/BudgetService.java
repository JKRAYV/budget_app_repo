package com.cognixia.group4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.group4.model.Budget;
import com.cognixia.group4.repository.BudgetRepository;

@Service
public class BudgetService {
	
	@Autowired
	BudgetRepository repo;
	
	public Budget createBudget(Budget budget) {
		return repo.save(budget);
	}

	public Budget updateBudget(Budget budget) {
		return repo.save(budget);
	}
}
