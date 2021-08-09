package com.foodieApp.food.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.feedback;

public interface feedbackDao extends JpaRepository<feedback,String> {
}