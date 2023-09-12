package com.cognixia.group4.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.group4.model.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long>{
	
	public Optional<User> findByUsername(String username);
	
}
