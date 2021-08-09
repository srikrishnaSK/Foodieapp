package com.foodieApp.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.foodieApp.food.entity.Login;
import com.foodieApp.food.entity.User;
import com.foodieApp.food.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService{
    
    private UserRepo userDao;
    
    @Autowired
    public UserServiceImpl(UserRepo userDao) {
		super();
		this.userDao = userDao;
		
	}

	@Autowired
	private PasswordEncoder encoder;
    
    @Override
    public void register(User user) {
    	user.setPassword(encoder.encode(user.getPassword()));
        userDao.save(user);
    }

	@Override
	public User findByName(String name) {
		return userDao.findByFirstname(name);
	}
    
//    @Override
//    public User validateUser(Login login) {
//        User user = null;
//        if (userDao.findById(login.getUsername()).isPresent()) {
//            user = userDao.findById(login.getUsername()).get();
//            if(!user.getPassword().equals(login.getPassword()))
//                user=null;
//        }
//        return user;
//    }
//
//    @Override
//    public Boolean usernameExists(String username){
//       return userDao.findById(username).isPresent();
//    }

}
