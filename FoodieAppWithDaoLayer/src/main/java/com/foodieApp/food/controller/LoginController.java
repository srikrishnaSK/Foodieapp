package com.foodieApp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.foodieApp.food.dao.RestuarantDaoImpl;
import com.foodieApp.food.dao.UserDaoImpl;
import com.foodieApp.food.entity.Login;
import com.foodieApp.food.entity.Restuarant;
import com.foodieApp.food.entity.User;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UserDaoImpl userDao;
    @Autowired
    private RestuarantDaoImpl restuarantDao ;


    @RequestMapping("/login")
    public Login showLogin() {
        return new Login();
    }

    @PostMapping("/login")
    public User loginProcess(@RequestBody Login login) {
    	System.out.println(login.getUsername());
    	System.out.println(login.getPassword());
        User user = null;
        Restuarant restuarant = null;
        restuarant = restuarantDao.validateUser(login);
        user = userDao.validateUser(login);
        if(user!=null) {
	    user.setPassword(null);
        return user;
        }
        else if(restuarant != null) {
        	restuarant.setPassword(null);
        	throw new ResponseStatusException(
			          HttpStatus.OK, "Restuarant Registered");
        }
        else {
        	throw new ResponseStatusException(
			          HttpStatus.BAD_REQUEST, "Invalid Credentials");
        }
	   
        
	     
    }


}
