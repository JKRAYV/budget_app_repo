package com.cognixia.group4.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cognixia.group4.model.Category;
import com.cognixia.group4.model.Category.ECategory;
import com.cognixia.group4.model.Transaction;
import com.cognixia.group4.repository.CategoryRepository;
import com.cognixia.group4.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository transactionRepository;
	
	@Autowired
    CategoryRepository categoryRepository;
	
	public ResponseEntity<Transaction> createTransaction(Transaction transactionRequest) {
		String description = transactionRequest.getDescription();
		double amount = transactionRequest.getAmount();
		Date date = transactionRequest.getDate();
		ECategory categoryName = transactionRequest.getCategory().getName();
		
		// Fetch Category objects from the database
        Category category = categoryRepository.findByName(categoryName);
        
     // Create a new Budget object with fetched Category and User
        Transaction transaction = new Transaction(description, amount, date, category);

        // Save the Budget object
        transactionRepository.save(transaction);

        return ResponseEntity.status(201).body(transaction);
	}
}
