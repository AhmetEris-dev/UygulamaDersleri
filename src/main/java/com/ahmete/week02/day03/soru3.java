package com.ahmete.week02.day03;

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
	/*
	girilen sayının mukemmel sayı olup olmadııgnı gösteren program
	*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int number = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (number == sum) {
			System.out.println("girilen " + number + " sayisi mukemmel sayidir");
		}
		else {
			System.out.println("girilen " + number + " sayisi mukemmel sayi değildir");
		}
	}
}