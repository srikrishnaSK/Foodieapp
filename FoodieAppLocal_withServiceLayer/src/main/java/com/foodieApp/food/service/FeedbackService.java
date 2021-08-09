package com.foodieApp.food.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.feedback;

public interface FeedbackService extends JpaRepository<feedback,String> {
}