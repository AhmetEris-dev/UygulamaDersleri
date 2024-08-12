package com.ahmete.week07.day01.sinavSoruCozumu.databases;

import com.ahmete.week07.day01.sinavSoruCozumu.entities.Restaurant;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class RestaurantDB extends DatabaseManager<Restaurant> {
	public Restaurant findByRestaurantName(String name) {
		
		for (Restaurant restaurant : veriListesi) {
			if (restaurant.getName().equals(name)) {
				return restaurant;
			}
		}
		System.out.println("There is no restaurant found by the name : " + name);
		return null;
	}
	
	public List<Restaurant> findWithCurrentCapacity(int personCount) {
		List<Restaurant> restaurantsWithCapacity = new ArrayList<>();
		for (Restaurant restaurant : veriListesi) {
			if (restaurant.getCurrentCapacity()>=personCount) {
				restaurantsWithCapacity.add(restaurant);
			}
		}
		return restaurantsWithCapacity;
	}
	
	public boolean existsById(int restaurantId) {
		for (Restaurant restaurant : veriListesi){
			if (restaurant.getId()==restaurantId){
				return true;
			}
		}
		return false;
	}
}