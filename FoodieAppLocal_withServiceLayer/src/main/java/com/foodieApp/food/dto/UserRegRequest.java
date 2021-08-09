package com.foodieApp.food.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class UserRegRequest {
	private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private String phone;
    private String roles;
	public UserRegRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public UserRegRequest(String username, String password, String firstname, String lastname, String email,
			String address, String phone, String roles) {
		super();
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.roles = roles;
	}
	
	


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "UserRegRequest [username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ ", roles=" + roles + "]";
	}
	
	
	
}
