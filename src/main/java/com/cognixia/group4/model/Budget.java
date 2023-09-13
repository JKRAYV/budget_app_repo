package com.cognixia.group4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

@Document(collection = "budgets")
public class Budget {
	
	@Id
	private String id;
	
	@NotBlank
	private Category category;
	
	private double maxBudget;
	
	private double total;

	public Budget() {

	}

	public Budget(@NotBlank Category category, double maxBudget, double total) {
		super();
		this.category = category;
		this.maxBudget = maxBudget;
		this.total = total;
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

	@Override
	public String toString() {
		return "Budget [id=" + id + ", category=" + category + ", maxBudget=" + maxBudget + ", total=" + total + "]";
	}
	
}
