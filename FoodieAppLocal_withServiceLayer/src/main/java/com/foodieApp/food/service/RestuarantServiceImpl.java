package com.foodieApp.food.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.entity.Dishes;
import com.foodieApp.food.entity.Login;
import com.foodieApp.food.entity.Restuarant;

@Service
public class RestuarantServiceImpl {
	
	@Autowired
	private RestuarantService restuarantDao;
	
	@Autowired
	private DishService dishdao;
	
	public void register(Restuarant restuarant) {
		restuarantDao.save(restuarant);
    }
	
    public Restuarant validateUser(Login login) {
    	Restuarant restAuth = null;
        List<Restuarant> restuarant = restuarantDao.findAll();
        for(int i=0;i<restuarant.size();i++) {
        	if(restuarant.get(i).getUsername().equals(login.getUsername())) {
        		restAuth = restuarant.get(i);
        		if(!restuarant.get(i).getPassword().equals(login.getPassword())) {
        			restAuth = null;
        		}
        	}
        }
        return restAuth;
    }

    public Boolean usernameExists(String username){
       return restuarantDao.findById(username).isPresent();
    }
    
	public List<Restuarant> approveRestuarant(String restuarantName) {
		List<Restuarant> restuarantData = (List<Restuarant>) restuarantDao.findAll();
		restuarantData = filter(restuarantData, restuarantName);
		restuarantDao.saveAll(restuarantData);
        return restuarantData;
        
	}
	
	public List<Restuarant> findAllRestuarants(String option){

		
		List<Restuarant> restuarantData = (List<Restuarant>) restuarantDao.findAll();
		System.out.println(restuarantData);

		
		for(int i=0;i<restuarantData.size();i++) {
			
			if(!restuarantData.get(i).getRestuarantname().equals(option) && !restuarantData.get(i).getLocation().equals(option)
					&& !restuarantData.get(i).getCategory().equals(option)){
				restuarantData.remove(i);
				}
			else if(!restuarantData.get(i).getIsapproved().equals(true) && !restuarantData.get(i).getAvailability().equals(true)) {
				restuarantData.remove(i);
			}
		}
		System.out.println("RestData"+restuarantData.toString());
		
		
		return restuarantData;	
		
	}
	
	
	public List<Restuarant> filter(List<Restuarant> restData,String restuarantName){
		for(int i=0;i<restData.size();i++) {
			if(restData.get(i).getRestuarantname().equals(restuarantName)) {
				restData.get(i).setIsapproved(true);
			}
		}
		return restData;
	}
	
	
	
	public List<Restuarant> restuarantAvailability(String restuarantName,String option) {
		List<Restuarant> restuarantData = (List<Restuarant>) restuarantDao.findAll();
		restuarantData = filteravailability(restuarantData, restuarantName, option);
		restuarantDao.saveAll(restuarantData);
        return restuarantData;
        
	}
	
	public List<Restuarant> filteravailability(List<Restuarant> restData,String restuarantName,String option){
		for(int i=0;i<restData.size();i++) {
			if(restData.get(i).getRestuarantname().equals(restuarantName)) {
				if(option.equals("enable")) {
					restData.get(i).setAvailability(true);
				}
				else {
					restData.get(i).setAvailability(false);
				}	
			}
		}
		return restData;
	}
	

	
	public List<Restuarant> getAvailableRestuarant() {
		List<Restuarant> restuarantData = (List<Restuarant>) restuarantDao.findAll();
		restuarantData = filterRestuarant(restuarantData);
		restuarantDao.saveAll(restuarantData);
        return restuarantData;
        
	}
	
	public List<Restuarant> filterRestuarant(List<Restuarant> restData){
		for(int i=0;i<restData.size();i++) {
			if(!restData.get(i).getIsapproved().equals(true)) {
				restData.remove(i);
			}
			else if(!restData.get(i).getAvailability().equals(true)) {
				restData.remove(i);
			}
		}
		return restData;
	}
}
