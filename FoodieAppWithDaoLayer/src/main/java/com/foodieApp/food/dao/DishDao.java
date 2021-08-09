package com.foodieApp.food.dao;


import org.springframework.data.repository.CrudRepository;

import com.foodieApp.food.entity.Dishes;

public interface DishDao extends CrudRepository<Dishes,String> {
}
