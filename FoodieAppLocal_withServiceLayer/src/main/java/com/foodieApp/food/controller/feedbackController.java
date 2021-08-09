package com.foodieApp.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodieApp.food.entity.feedback;
import com.foodieApp.food.service.FeedbackServiceImpl;






@RestController
@CrossOrigin()
public class feedbackController {
	
	@Autowired
    private FeedbackServiceImpl feedbackdao;


    @PostMapping("/feedback")
    public feedback addUser(@RequestBody feedback fdback) {
        System.out.println(fdback.toString());
        feedbackdao.register(fdback);
        return fdback;
    }
    
    @GetMapping("/getfeedback")
    public List<feedback> getfeedback(){
    	List<feedback> fbacks = feedbackdao.getFeedback();   
    	System.out.println(fbacks.toString());
    	return fbacks;
    	}

}