package com.cognixia.group4.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cognixia.group4.model.Category;
import com.cognixia.group4.model.Category.ECategory;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String>{

	Category findByName(ECategory categoryName);

}
