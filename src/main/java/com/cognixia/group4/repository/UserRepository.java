package com.cognixia.group4.repository;

import java.util.Optional;

import com.cognixia.group4.model.User;

public class UserRepository {
	
	public Optional<User> findByUsername(String username);
	
}
