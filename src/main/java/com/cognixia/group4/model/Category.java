package com.cognixia.group4.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
public class Category {
	
	public static enum ECategory {FOOD, ENTERTAINMENT, UTILITY};
	
	@Id
	private String id;
	
	private ECategory name;
	
	public Category() {
		
	}

	public Category(ECategory name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ECategory getName() {
		return name;
	}

	public void setName(ECategory name) {
		this.name = name;
	}
	
}
