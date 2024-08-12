package com.ahmete.week07.day01.sinavSoruCozumu.entities;

public class BaseEntity {
	protected final int id;
	
	public BaseEntity(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
}