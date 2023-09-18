package com.cognixia.group4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.group4.model.User;
import com.cognixia.group4.repository.UserRepository;
import com.cognixia.group4.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

	@Autowired
	UserRepository repo;
	
	@Autowired
	UserService service;

	@Autowired
	PasswordEncoder encoder;

	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user) {

		user.setId(null);

		user.setPassword(encoder.encode(user.getPassword()));

		User created = service.createUser(user);

		return ResponseEntity.status(201).body(created);
	}
}
