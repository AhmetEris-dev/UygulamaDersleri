package com.ahmete.week02.day01;

import java.util.Scanner;

public class soru6 {
	/*
	 * dısarıdan 2 adet tam sayi degeri alalım iki sayinin toplamı cift iste true değil ise false yazdıralım bu
	 * değerlerin bir de ortalamasını alalım ve yazdıralım
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number1, number2;
		double average;
		boolean isEven;
		
		System.out.println("birinci sayiyi giriniz: ");
		number1 = scanner.nextInt();
		
		System.out.println("ikinci sayiyi giriniz: ");
		number2 = scanner.nextInt();
		average = (double) (number1 + number2) / 2.0; // double a kast lamak yerine (number1+number2)/2.0 yaz
		
		isEven = ((number1 + number2) % 2 == 0);
		System.out.println(average + " " + isEven);
		
		
		
		
	}
}