package com.foodieApp.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.foodieApp.food.entity.User;
import com.foodieApp.food.service.UserService;

@SpringBootApplication
public class FoodieAppApplication {
	
//	@Autowired
//	private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(FoodieAppApplication.class, args);
    }
    
    
//    User user1 = new  User("arya","arya","","","","","","ROLE_USER"); 

    
}
