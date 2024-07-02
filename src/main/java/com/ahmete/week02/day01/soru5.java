package com.ahmete.week02.day01;

import java.util.Scanner;

public class soru5 {
	/*
	 *  dairenin alanını ve cevresini bulalım (cap yada yarıcap input olarak gelsin)
	 */
	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen bir yarıcap giriniz; ");
		double radius = scanner.nextDouble();
		double calculatedArea = PI * radius * radius;
		double circumference = 2 * PI * radius;
		System.out.println("dairenin alanu: " + calculatedArea + "\nDairenin cevresi: " + circumference);
		
		
		
	}
}