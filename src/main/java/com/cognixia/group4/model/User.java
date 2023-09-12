package com.cognixia.group4.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import com.cognixia.jump.model.User.Role;


public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public static enum Role {
		USER
	}
	
	@Id
	private Integer id;
	private String username;
	private String password;
	private Role role;
	
	public User() {
		
	}

	public User(Integer id, String username, String password, Role role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	};
	
}
