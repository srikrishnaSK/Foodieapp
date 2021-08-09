package com.foodieApp.food.service;


import org.springframework.data.repository.CrudRepository;

import com.foodieApp.food.entity.Dishes;

public interface DishService extends CrudRepository<Dishes,String> {
}
