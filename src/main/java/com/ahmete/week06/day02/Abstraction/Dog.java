package com.ahmete.week06.day02.Abstraction;

public class Dog extends EvcilHayvan{
	public Dog(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void MakeSound() {
		System.out.println(name+" hav hav hav");
	}
	
	@Override
	public void playWoolBall() {
	
	}
	
	
	@Override
	public void bringTheStick() {
		System.out.println(name+" sopayı getirir");
	}
}