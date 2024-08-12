package com.ahmete.week07.day01.sinavSoruCozumu.databases;

import com.ahmete.week07.day01.sinavSoruCozumu.entities.Customer;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;

public class CustomerDB extends DatabaseManager<Customer> {
	public boolean existsByEmailAndPhoneNo(String email, String phoneNo){
		for(Customer customer : veriListesi){
			if(customer.getPhoneNo().equals(phoneNo) && customer.getEmail().equals(email)){
				return true;
			}
		}
		return false;
	}
	
	public List<Customer> findByNameAndSurname(String name, String surname) {
		List<Customer> customerList = new ArrayList<>();
		for(Customer customer: veriListesi){
			if(customer.getName().equals(name)&& customer.getSurname().equals(surname)){
				customerList.add(customer);
			}
		}
		return customerList;
	}
	
	public Customer findByEmailAndPhoneNo(String email, String phoneNo) {
		for (Customer customer: veriListesi){
			if (customer.getEmail().equals(email) && customer.getPhoneNo().equals(phoneNo)){
				return customer;
			}
		}
		return null;
	}
}