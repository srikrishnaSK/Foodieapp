package com.foodieApp.food.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodieApp.food.entity.onlineOrders;

public interface OnlineorderService extends JpaRepository<onlineOrders,String> {
}