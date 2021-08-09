package com.foodieApp.food.entity;

import java.security.SecureRandom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "online_orders")
public class onlineOrders {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	private String restuarantname;
	private String username;
	private String productdetails;
	private String totalvalue;
	private String orderstatus;
	
    public onlineOrders() {

    }
    
	public onlineOrders(String restuarantname,String username, String productdetails, String totalvalue, String orderstatus) {
    	this.restuarantname = restuarantname;
    	this.username = username;
    	this.productdetails = productdetails;
    	this.totalvalue = totalvalue;
    	this.orderstatus = orderstatus;
	}
	
	
	


	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public String getRestuarantname() {
		return restuarantname;
	}
	public void setRestuarantname(String restuarantname) {
		this.restuarantname = restuarantname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	public String getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(String totalvalue) {
		this.totalvalue = totalvalue;
	}
	@Override
    public String toString() {
        return "Order Details{" +
        		"id='" + id + '\'' +
                "restuarantname='" + restuarantname + '\'' +
                ", username='" + username + '\'' +
                ", productdetails='" + productdetails + '\'' +
                ", totalvalue='" + totalvalue + '\'' +
                ", orderstaus='" + orderstatus + '\'' +
                '}';
    }

}
