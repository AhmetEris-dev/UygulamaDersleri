package com.ahmete.week06.day02.Abstraction;

public class Test {
	public static void main(String[] args) {
		Cat tekir=new Cat(4,"tekir");
		tekir.eat();
		tekir.MakeSound();
		tekir.playWoolBall();
		
		
		Dog karabas=new Dog(4,"karabas");
		karabas.eat();
		karabas.bringTheStick();
		karabas.sleep();
		karabas.MakeSound();
	}
	
}