package com.ahmete.week06.day02.Abstraction;

import java.time.Period;

public abstract class EvcilHayvan {
	
	protected String name;
	protected int age;
	
	public  void eat(){
		System.out.println(name+ " yemek yiyor ");
	}
	
	public  void sleep(){
		System.out.println(name+" uyuyor");
	}
	
	public  void MakeSound(){
	
	}
	
	public abstract void playWoolBall();
	
	public abstract void bringTheStick();
	
	public EvcilHayvan(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "EvcilHayvan{" + "age=" + getAge() + ", name='" + getName() + '\'' + '}';
	}
}