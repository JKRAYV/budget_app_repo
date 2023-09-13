package com.cognixia.group4.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cognixia.group4.model.ERole;
import com.cognixia.group4.model.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Optional<Role> findByName(ERole name);
}
