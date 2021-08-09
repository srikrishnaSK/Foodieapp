package com.foodieApp.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.entity.feedback;


@Service
public class FeedbackServiceImpl {
	
	@Autowired
	private FeedbackService feedbackdao;
	
	public void register(feedback fdback) {
		feedbackdao.save(fdback);
    }
	
	
	public List<feedback> getFeedback(){
		List<feedback> feedbacks = feedbackdao.findAll();
		return feedbacks;
	}
}