package com.cognixia.group4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.group4.model.User;
import com.cognixia.group4.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User createUser(User user) {
		return repo.save(user);
	}
}
