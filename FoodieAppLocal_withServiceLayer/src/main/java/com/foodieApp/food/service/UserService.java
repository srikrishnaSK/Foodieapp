package com.foodieApp.food.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.Login;
import com.foodieApp.food.entity.User;

public interface UserService {
	public void register(User user);
//	public User validateUser(Login login);
//	public Boolean usernameExists(String username);
	public User findByName(String name);
}