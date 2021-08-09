package com.foodieApp.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.foodieApp.food.dto.SecUser;
import com.foodieApp.food.entity.User;


//Who will use ? spring sec use it to verifty the user
@Service
public class DetailService implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userService.findByName(username);
		if(user==null) {
			throw new UsernameNotFoundException("user is not found");
		}
		//we will return the object of user which spring sec undertand
		return new SecUser(user);
	}

}
