package com.ahmete.week06.day02.Abstraction;

public class Cat extends EvcilHayvan{
	public Cat(int age, String name) {
		super(age, name);
	}
	
	@Override
	public void MakeSound() {
		System.out.println(name+" miyav miyav miyav");
	}
	
	@Override
	public void playWoolBall() {
		System.out.println(name+"  topla oynar");
	}
	
	@Override
	public void bringTheStick() {
	
	}
}