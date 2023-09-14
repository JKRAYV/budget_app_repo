package com.cognixia.group4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognixia.group4.model.Budget;
import com.cognixia.group4.model.Category;
import com.cognixia.group4.model.Category.ECategory;
import com.cognixia.group4.model.User;
import com.cognixia.group4.repository.BudgetRepository;
import com.cognixia.group4.repository.CategoryRepository;
import com.cognixia.group4.repository.UserRepository;

@Service
public class BudgetService {
	
	@Autowired
	BudgetRepository budgetRepository;
	
	@Autowired
    CategoryRepository categoryRepository;
    
    @Autowired
    UserRepository userRepository;
    
    public List<Budget> getBudgets() {
    	return budgetRepository.findAll();
    }
	
	public ResponseEntity<Budget> createBudget(Budget budgetRequest) {
            // Extract data from the request
            double maxBudget = budgetRequest.getMaxBudget();
            double total = budgetRequest.getTotal();
            ECategory categoryName = budgetRequest.getCategory().getName();
            String username = budgetRequest.getUser().getUsername();

            // Fetch Category and User objects from the database
            Category category = categoryRepository.findByName(categoryName);
            User user = userRepository.findByUsername(username);
            
            // Create a new Budget object with fetched Category and User
            Budget budget = new Budget(maxBudget, total, category, user);

            // Save the Budget object
            budgetRepository.save(budget);

            return ResponseEntity.status(201).body(budget);
	}

	public Budget updateBudget(Budget budget) {
		return budgetRepository.save(budget);
	}
}
