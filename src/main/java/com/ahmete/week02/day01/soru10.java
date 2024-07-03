package com.ahmete.week02.day01;

import java.util.Scanner;

public class soru10 {
	/*
	 girilen sayının basamakları toplamını ekrana yazdıralım.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayi giriniz.");
		int sayi = scanner.nextInt();
		
		int toplam = 0;
		while (sayi > 0) {
			int basamak = sayi % 10;
			toplam += basamak;
			sayi /= 10; //number=number / 10
		}
		System.out.println("girdiğiniz sayinin basamak değerleri toplamı: "+toplam);
	}
}