package com.ahmete.week06.day03.utility;

public interface ICRUD<T> {
	
	T save(T t);
	
	Iterable<T> saveAll(Iterable<T> t);
	
	T update( T t);
	
	Iterable<T> findAll();
	
	T findByID(int id);
	
}