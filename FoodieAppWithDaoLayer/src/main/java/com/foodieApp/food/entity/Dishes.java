package com.foodieApp.food.entity;

import java.security.SecureRandom;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dishes {

	@Id
	private String id = String.format("%05d",new SecureRandom().nextInt(100000));
	private String resturantname;
	private String dishtype;
	private String cusine;
	private String dishname;
	private String dishprice;
	private String description;
	private String availabletime;
	private Boolean enabledish = true;
	private Boolean availability = true;



	public Dishes() {

    }


	public Dishes(String resturantname, String dishtype, String cusine, String dishname, String dishprice, String description, String availabletime ) {
    	
        this.resturantname = resturantname;
        this.dishtype = dishtype;
        this.cusine = cusine;
        this.dishname = dishname;
        this.dishprice = dishprice;
        this.description = description;
        this.availabletime = availabletime;
    }
	
    public Boolean getAvailability() {
		return availability;
	}


	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}

    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Boolean getEnabledish() {
		return enabledish;
	}

	public void setEnabledish(Boolean enabledish) {
		this.enabledish = enabledish;
	}

	public String getResturantname() {
		return resturantname;
	}
	public void setResturantname(String resturantname) {
		this.resturantname = resturantname;
	}
	public String getDishtype() {
		return dishtype;
	}
	public void setDishtype(String dishtype) {
		this.dishtype = dishtype;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public String getDishname() {
		return dishname;
	}
	public void setDishname(String dishname) {
		this.dishname = dishname;
	}
	public String getDishprice() {
		return dishprice;
	}
	public void setDishprice(String dishprice) {
		this.dishprice = dishprice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAvailabletime() {
		return availabletime;
	}
	public void setAvailabletime(String availabletime) {
		this.availabletime = availabletime;
	}
	
	@Override
    public String toString() {
        return "Dish{" +
        		"id='" + id + '\'' +
                "resturantname='" + resturantname + '\'' +
                ", dishtype='" + dishtype + '\'' +
                ", cusine='" + cusine + '\'' +
                ", dishname='" + dishname + '\'' +
                ", dishprice='" + dishprice + '\'' +
                ", description='" + description + '\'' +
                ", availabletime=" + availabletime +
                ", enabledish=" + enabledish +
                ", availability=" + availability +
                '}';
    }
}
