 package com.foodieApp.food.dto;


public class AuthResponse {
	private String status;
	private String roles;
	public AuthResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AuthResponse(String status, String roles) {
		super();
		this.status = status;
		this.roles = roles;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "AuthResponse [status=" + status + ", roles=" + roles + "]";
	}
	
	
	
	
	


}