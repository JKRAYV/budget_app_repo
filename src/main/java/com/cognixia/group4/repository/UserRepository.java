package com.cognixia.group4.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.group4.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	public User findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
}
