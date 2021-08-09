package com.foodieApp.food.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.foodieApp.food.entity.Restuarant;
import com.foodieApp.food.entity.User;
import com.foodieApp.food.service.RestuarantServiceImpl;
import com.foodieApp.food.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserRestuarantController {

    @Autowired
    private UserServiceImpl userDao;
    @Autowired
    private RestuarantServiceImpl restuarantDaoImpl;


    @PostMapping("/userregister")
    public User addDish(@RequestBody User user) {
        System.out.println(user.toString());
        userDao.register(user);
        return user;
    }

//    @PostMapping("/checkUserName")
//    public boolean checkAvailability(@RequestBody String username){
//        return userDao.usernameExists(username);
//    }
    
    @PostMapping("/registerRestuarant")
    public Restuarant addRestuarant(@RequestBody Restuarant restuarant) {
    	System.out.println(restuarant.toString());
    	restuarantDaoImpl.register(restuarant);
    	return restuarant;
    }
    
    @PostMapping("/approve/{restuarantName}")
    public List<Restuarant> adminApprove(@PathVariable("restuarantName") String restuarantName) {
    	
    	List<Restuarant> restuarantData = restuarantDaoImpl.approveRestuarant(restuarantName);
    	System.out.println(restuarantData.toString());
    	return restuarantData;	
    }
    
    @PostMapping("/availability/{restuarantName}/{option}")
    public List<Restuarant> adminApprove(@PathVariable("restuarantName") String restuarantName,@PathVariable("option") String option) {
    	List<Restuarant> restuarantData = restuarantDaoImpl.restuarantAvailability(restuarantName,option);
    	System.out.println(restuarantData.toString());
    	return restuarantData;	
    }
    
    @GetMapping("/availabelRestuarants")
    public List<Restuarant> availableRestuarants() {
    	List<Restuarant> restuarantData = restuarantDaoImpl.getAvailableRestuarant();
    	System.out.println(restuarantData.toString());
    	return restuarantData;	
    }
    
    
    @GetMapping("/findrestuarant/{option}")
    public List<Restuarant> findRestuarnat(@PathVariable("option") String option){
    	List<Restuarant> restuarantData = restuarantDaoImpl.findAllRestuarants(option);
    	return restuarantData;
    }
}
