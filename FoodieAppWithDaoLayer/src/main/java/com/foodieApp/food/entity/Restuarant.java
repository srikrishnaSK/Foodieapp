package com.foodieApp.food.entity;

import java.security.SecureRandom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restuarant {

	@Id
	private String id = String.format("%05d",new SecureRandom().nextInt(100000));
    private String username;
    private String password;
    private String restuarantname;
    private String category;
    private String location;
    private String contactdetails;
    private Boolean isapproved = false;
    private Boolean availability = true;
  
    public Boolean getAvailability() {
		return availability;
	}

	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

	public Restuarant() {

    }
    
	public Restuarant(String username,String password, String restuarantname, String category, String location, String contactdetails) {
    	this.username = username;
    	this.password = password;
    	this.restuarantname = restuarantname;
    	this.category = category;
    	this.location = location;
    	this.contactdetails = contactdetails;
    
    }
	
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getRestuarantname() {
		return restuarantname;
	}

	public void setRestuarantname(String restuarantname) {
		this.restuarantname = restuarantname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactdetails() {
		return contactdetails;
	}

	public void setContactdetails(String contactdetails) {
		this.contactdetails = contactdetails;
	}

	public Boolean getIsapproved() {
		return isapproved;
	}

	public void setIsapproved(Boolean isapproved) {
		this.isapproved = isapproved;
	}


	 @Override
	    public String toString() {
	        return "Restuarant{" +
	        		
	        		"id='" + id + '\'' +
	                "username='" + username + '\'' +
	                ", password='" + password + '\'' +
	                ", resturantname='" + restuarantname + '\'' +
	                ", category='" + category + '\'' +
	                ", location='" + location + '\'' +
	                ", contactDetails='" + contactdetails + '\''+
	                ", isapproved='" + isapproved + '\''+
	                ", availability='" + availability + '\''+
	                '}';
	    }
}
