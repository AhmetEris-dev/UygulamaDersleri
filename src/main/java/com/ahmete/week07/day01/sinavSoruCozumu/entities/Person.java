package com.ahmete.week07.day01.sinavSoruCozumu.entities;

public class Person extends BaseEntity{
	private String name;
	private String surname;
	public Person(int id) {
		super(id);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}