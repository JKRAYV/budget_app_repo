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
	
	private double amount;

	public Budget() {

	}

	public Budget(@NotBlank Category category, double amount) {
		super();
		this.category = category;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Budget [id=" + id + ", category=" + category + ", amount=" + amount + "]";
	}
	
}
