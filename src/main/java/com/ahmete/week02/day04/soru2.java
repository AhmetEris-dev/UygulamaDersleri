package com.ahmete.week02.day04;

import java.util.Scanner;

public class soru2 {
	/*
	Dışarıdan bir değer alacağız. Bu değerin içerisinde kaç tane a harfi oldugunu yazdıracağız
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String kelime = scanner.nextLine();
		int index = 0;
		int sayac = 0;
		char ch = 'a';
		while (index < kelime.length()) {
			if (kelime.charAt(index) == ch) {
				sayac++;
			}
			index++;
		}
		System.out.println("girdiginiz " + kelime + " kelimesinde " + sayac + " adet " + ch + " harfi bulunmaktadır.");
		
		
	}
}