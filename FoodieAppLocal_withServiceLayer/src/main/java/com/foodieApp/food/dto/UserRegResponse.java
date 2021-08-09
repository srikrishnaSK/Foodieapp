package com.foodieApp.food.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;



public class UserRegResponse {
	private String username;
	private String roles;
	private String message;
	public UserRegResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegResponse(String username, String roles, String message) {
		super();
		this.username = username;
		this.roles = roles;
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "UserRegResponse [username=" + username + ", roles=" + roles + ", message=" + message + "]";
	}
	
	
	
	
	
}
