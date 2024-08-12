package com.ahmete.week07.day01.sinavSoruCozumu;

import com.ahmete.week07.day01.sinavSoruCozumu.databases.CustomerDB;
import com.ahmete.week07.day01.sinavSoruCozumu.databases.ManagerDB;
import com.ahmete.week07.day01.sinavSoruCozumu.databases.ReservationDB;
import com.ahmete.week07.day01.sinavSoruCozumu.databases.RestaurantDB;
import com.ahmete.week07.day01.sinavSoruCozumu.entities.Customer;
import com.ahmete.week07.day01.sinavSoruCozumu.entities.Manager;
import com.ahmete.week07.day01.sinavSoruCozumu.entities.Restaurant;
import com.ahmete.week07.day01.sinavSoruCozumu.modules.CustomerModule;
import com.ahmete.week07.day01.sinavSoruCozumu.modules.ManagerModule;
import com.ahmete.week07.day01.sinavSoruCozumu.utility.enums.DataGenerator;

import java.util.List;
import java.util.Scanner;

public class RestaurantApp {
	
	private static ManagerDB managerDB = new ManagerDB();
	private static CustomerDB customerDB = new CustomerDB();
	private static RestaurantDB restaurantDB = new RestaurantDB();
	private static ReservationDB reservationDB = new ReservationDB();
	private static Manager manager;
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		manager = new Manager(managerDB,restaurantDB,customerDB,reservationDB);
		List<Customer> customers = DataGenerator.generateCustomers(10, customerDB); // Generate 10 customers
		List<Restaurant> restaurants = DataGenerator.generateRestaurants(5, restaurantDB);
		startApplication();
	}
	
	private static void startApplication() {
		int opt = 0;
		do {
			opt = welcomeMenuOptions(welcomeMenu());
		} while (opt!=0);
	}
	
	private static int welcomeMenu() {
		System.out.println("### RESTAURANT APP ###");
		System.out.println("1- Proceed as Manager");
		System.out.println("2- Proceed as Customer");
		System.out.println("0- Exit");
		System.out.print("Please choose an option : ");
		int opt = scanner.nextInt();
		scanner.nextLine();
		return opt;
	}
	
	private static int welcomeMenuOptions(int opt){
		switch (opt){
			case 1:{
				ManagerModule.managerModule(managerDB,restaurantDB);
				break;
			}
			case 2:{
				CustomerModule.customerModule(manager, restaurantDB, reservationDB, customerDB);
				break;
			}
			case 0:{
				System.out.println("Thanks for coming...");
				break;
			}
		}
		return opt;
	}
}