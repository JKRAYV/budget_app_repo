package com.cognixia.group4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.group4.model.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>{

}
