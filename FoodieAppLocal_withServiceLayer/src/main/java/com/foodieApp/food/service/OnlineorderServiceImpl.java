package com.foodieApp.food.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodieApp.food.entity.onlineOrders;

@Service
public class OnlineorderServiceImpl {
	
	@Autowired
	private OnlineorderService onlineorderdao;
	
	public void register(onlineOrders onlineorders) {
		onlineorderdao.save(onlineorders);
    }
	
	
	public List<onlineOrders> getOrders(String restuarantName){
		List<onlineOrders> orders = onlineorderdao.findAll();
		orders = filter(orders, restuarantName);
		return orders;
	}
	
	public List<onlineOrders> filter(List<onlineOrders> filterOrders,String restuarantName){
		for(int i=0;i<filterOrders.size();i++) {
			if(!filterOrders.get(i).getRestuarantname().equals(restuarantName)){
				System.out.println(filterOrders.get(i).getRestuarantname());
				System.out.println("Here1");
				filterOrders.remove(i);
			}
		}
		return filterOrders;
	}
	
	public List<onlineOrders> adminGetAllOrders(){
		
		List<onlineOrders> allOrders = onlineorderdao.findAll();
		return allOrders;
	}
	
	
}

