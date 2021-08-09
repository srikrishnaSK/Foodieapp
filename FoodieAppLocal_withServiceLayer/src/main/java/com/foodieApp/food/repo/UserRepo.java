package com.foodieApp.food.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	public User findByFirstname(String name);

}
