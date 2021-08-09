package com.foodieApp.food.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class feedback {
	
	@Id
	private String restuarantname;
	private String username;
	private String feedbackdata;
	
	
	public feedback() {
	}
	
	public feedback(String restuarantname,String username, String feedbackdata) {
		this.restuarantname = restuarantname;
		this.username = username;
		this.feedbackdata = feedbackdata;
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

	public String getFeedbackdata() {
		return feedbackdata;
	}

	public void setFeedbackdata(String feedbackdata) {
		this.feedbackdata = feedbackdata;
	}
	
    @Override
    public String toString() {
        return "Feedback{" +
                "restuarantname='" + restuarantname + '\'' +
                ", username='" + username + '\'' +
                ", feedbackdata='" + feedbackdata + '\'' +
                '}';
    }

}
