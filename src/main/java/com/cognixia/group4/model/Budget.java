package com.cognixia.group4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cognixia.group4.util.CategoryDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "budgets")
public class Budget {
	
	@Id
	private String id;
	
	@DBRef
	@JsonDeserialize(using = CategoryDeserializer.class)
	private Category category;
	
	private double maxBudget;
	
	private double total;
	
	@DBRef
	private User user;

	public Budget() {

	}

	public Budget(double maxBudget, double total, Category category, User user) {
		this.maxBudget = maxBudget;
		this.total = total;
		this.category = category;
        this.user = user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getMaxBudget() {
		return maxBudget;
	}

	public void setMaxBudget(double maxBudget) {
		this.maxBudget = maxBudget;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Budget [id=" + id + ", category=" + category + ", maxBudget=" + maxBudget + ", total=" + total + ", user=" + user + "]";
	}
	
}
