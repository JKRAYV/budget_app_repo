package com.cognixia.group4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.group4.model.Budget;

@Repository
public interface BudgetRepository extends MongoRepository<Budget, String>{

//	Budget save(double maxBudget, double total);

}
