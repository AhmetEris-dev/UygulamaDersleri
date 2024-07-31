package com.ahmete.week04.kks.refactored.utility;

import com.ahmete.week04.kks.refactored.entities.BaseEntitiy;

import java.util.List;

public interface ICRUD<T> {
	
	T save(T t);
	
	Iterable<T> saveAll(Iterable<T> t);
	
	T update( T t);
	
	Iterable<T> findAll();
	
	T findByID(int id);
	
}