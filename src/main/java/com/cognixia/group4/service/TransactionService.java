package com.cognixia.group4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.group4.model.Transaction;
import com.cognixia.group4.repository.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	TransactionRepository repo;
	
	public Transaction createTransaction(Transaction transaction) {
		return repo.save(transaction);
	}
}
