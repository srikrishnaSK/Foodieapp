package com.foodieApp.food.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.Restuarant;

public interface RestuarantService extends JpaRepository<Restuarant,String> {
}

