package com.ahmete.week02.day02;

import java.util.Scanner;

public class soru1 {
	/*
	 Dışarıdan taban değeri ve üs isimli 2 tane değişken alınacak. (2 üzeri 5 gibi) tabanın kuvvetini hesaplamak
	 istiyorum.
    Hesaplamayı yaptıktan sonra, kullanıcıya ismini soracağım. Sonra çıktı olarak; "kullaniciIsmi + "n üzeri x
    isleminin sonucu " "
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir taban değeri giriniz");
		int base = scanner.nextInt();
		System.out.println("Lutfen bir üs değeri giriniz");
		int power = scanner.nextInt();
		scanner.nextLine();
		long result = 1;
		for (int i = 0; i < power; i++) {
			result *= base;
		}
		System.out.println("lutfen adinizi giriniz");
		String name = scanner.nextLine();
		System.out.println(name + " girdiğin " + base + " sayisinin " + power + ". kuvveti " + result + " sayinina " +
				                   "esittir");
		
		
	}
}