package com.foodieApp.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.foodieApp.food.dto.AuthResponse;
import com.foodieApp.food.dto.SecUser;
import com.foodieApp.food.dto.UserRegRequest;
import com.foodieApp.food.dto.UserRegResponse;
import com.foodieApp.food.entity.Login;
import com.foodieApp.food.entity.Restuarant;
import com.foodieApp.food.entity.User;
import com.foodieApp.food.service.RestuarantService;
import com.foodieApp.food.service.RestuarantServiceImpl;
import com.foodieApp.food.service.UserService;
import com.foodieApp.food.service.UserServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Primary
public class LoginController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestuarantService restuarantDao ;


//    @RequestMapping("/login")
//    public Login showLogin() {
//        return new Login();
//    }
    
    @GetMapping("login")
	public AuthResponse validateLogin(@AuthenticationPrincipal SecUser secUser) {
		System.out.println("------------------------------");
		System.out.println(secUser.getUser());
		System.out.println("------------------------------");
		return new AuthResponse("User successfully authenticated", secUser.getUser().getRole());
	}

	@PostMapping("register")
	public UserRegResponse userRegister(@RequestBody UserRegRequest userReq) {
		System.out.println(userReq);
		User user = new User();
		user.setFirstname(userReq.getFirstname());
		user.setLastname(userReq.getLastname());
		user.setPassword(userReq.getPassword());
		user.setAddress(userReq.getAddress());
		user.setEmail(userReq.getEmail());
		user.setPhone(userReq.getPhone());
		user.setUsername(userReq.getUsername());
		user.setRole(userReq.getRoles());
		System.out.println("--------adding to db----------");
		userService.register(user);
		
		return new UserRegResponse(user.getUsername(), user.getRole(),
				"reg successfully role is change by admin latter on");
	}

//    @PostMapping("/login")
//    public User loginProcess(@RequestBody Login login) {
//    	System.out.println(login.getUsername());
//    	System.out.println(login.getPassword());
//        User user = null;
//        Restuarant restuarant = null;
//        restuarant = restuarantDao.validateUser(login);
//        user = userDao.validateUser(login);
//        if(user!=null) {
//	    user.setPassword(null);
//        return user;
//        }
//        else if(restuarant != null) {
//        	restuarant.setPassword(null);
//        	throw new ResponseStatusException(
//			          HttpStatus.OK, "Restuarant Registered");
//        }
//        else {
//        	throw new ResponseStatusException(
//			          HttpStatus.BAD_REQUEST, "Invalid Credentials");
//        }
//	   
        
	     
    }


