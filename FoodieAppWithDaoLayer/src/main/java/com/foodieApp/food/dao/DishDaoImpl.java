package com.foodieApp.food.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.foodieApp.food.entity.Dishes;

@Service
public class DishDaoImpl {
	
	@Autowired
	private DishDao dishDao;
	
	public void register(Dishes addish) {
		dishDao.save(addish);
    }
	
	public List<Dishes> modifyDish(String restuarantName,String dishName,String option) {
		List<Dishes> dishes = (List<Dishes>) dishDao.findAll();
		dishes = filter(dishes, restuarantName, dishName,option);
		dishDao.saveAll(dishes);
        return dishes;
        
	}
	
    public List<Dishes> filter(List<Dishes> dish,String restuarantName,String dishName,String option){
    	if(option.equals("disable")) {
	    	for(int i=0;i<dish.size();i++) {
	    		if(dish.get(i).getResturantname().equals(restuarantName) & dish.get(i).getDishname().equals(dishName)){
	    			dish.get(i).setEnabledish(false);
	    		}
	    	}
    	}
    	else if(option.equals("enable")) {
    		for(int i=0;i<dish.size();i++) {
	    		if(dish.get(i).getResturantname().equals(restuarantName) & dish.get(i).getDishname().equals(dishName)){
	    			dish.get(i).setEnabledish(true);
	    		}
	    	}
    	}
    	else if(option.equals("remove")) {
    		for(int i=0;i<dish.size();i++) {
	    		if(dish.get(i).getResturantname().equals(restuarantName) & dish.get(i).getDishname().equals(dishName)){
	    			dish.get(i).setAvailability(false);
	    		}
	    	}
    	}
    	else {
    		throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "option Not found Use either ,enable,disable,remove");
    	}
    	return dish;
    }
}
