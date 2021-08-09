package com.foodieApp.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodieApp.food.dao.onlineorderDao;
import com.foodieApp.food.dao.onlineorderDaoImpl;
import com.foodieApp.food.entity.onlineOrders;


@RestController
@CrossOrigin()
public class onlineOrdersController {
	
	@Autowired
    private onlineorderDaoImpl onlineorderdao;


    @PostMapping("/addOrder")
    public onlineOrders updateOrders(@RequestBody onlineOrders onlineorder) {
        System.out.println(onlineorder.toString());
        onlineorderdao.register(onlineorder);
        return onlineorder;
    }
    
    
    @GetMapping("/getOrders/{restuarantName}")
    public List<onlineOrders> getOrders(@PathVariable("restuarantName") String restuarantName) {
    	List<onlineOrders> orders = onlineorderdao.getOrders(restuarantName);
    	System.out.println(orders);
    	return orders;
    }
    
    @GetMapping("/getOrders")
    public List<onlineOrders> getAllOrders() {
    	List<onlineOrders> orders = onlineorderdao.adminGetAllOrders();
    	System.out.println(orders);
    	return orders;
    }
    
    
    
}