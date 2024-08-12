package com.ahmete.week07.day01.sinavSoruCozumu.databases;

import com.ahmete.week07.day01.sinavSoruCozumu.entities.Manager;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.DatabaseManager;

public class ManagerDB extends DatabaseManager<Manager> {
	public Manager findByUsernameAndPassword(String userName, String password) {
		
		for(Manager manager : veriListesi){
			if(manager.getUSERNAME().equals(userName)&& manager.getPassword().equals(password)){
				return manager;
			}
		}
		System.out.println("Credentiels does not match");
		return null;
	}
}