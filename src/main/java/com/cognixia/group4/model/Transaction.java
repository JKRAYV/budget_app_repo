package com.cognixia.group4.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import jakarta.validation.constraints.NotBlank;

@Document(collection="transactions")
public class Transaction {
	
	@Id
	private String id;
	
	@NotBlank
	private String description;

	private double amount;
	
	@Field(targetType = FieldType.DATE_TIME)
	private Date date;
	
	private Category category;

	public Transaction() {
		
	}

	public Transaction(@NotBlank String description, double amount, Date date, Category category) {
		super();
		this.description = description;
		this.amount = amount;
		this.date = date;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", description=" + description + ", amount=" + amount + ", date=" + date
				+ ", category=" + category + "]";
	}
	
}
