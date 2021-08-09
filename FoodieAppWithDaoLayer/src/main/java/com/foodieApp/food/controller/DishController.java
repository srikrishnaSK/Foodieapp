package com.foodieApp.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.foodieApp.food.dao.DishDaoImpl;
import com.foodieApp.food.entity.Dishes;

@RestController
@CrossOrigin()
public class DishController {
	
	@Autowired
    private DishDaoImpl addishDao;


    @PostMapping("/addDish")
    public Dishes addUser(@RequestBody Dishes addish) {
        System.out.println(addish.toString());
        addishDao.register(addish);
        return addish;
    }
    
    @PostMapping("/modifyDish/{restuarantName}/{dishName}/{option}")
    public List<Dishes> modifyDish(@PathVariable("restuarantName") String restuarantName, @PathVariable("dishName") String dishName,@PathVariable("option") String option) {
    	List<Dishes> dishes = addishDao.modifyDish(restuarantName,dishName,option);
    	System.out.println(dishes);
    	return dishes;
    }
    
}


