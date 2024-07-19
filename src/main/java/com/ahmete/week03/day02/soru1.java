package com.ahmete.week03.day02;
/*
Dışarıdan girilen ülke ismi bizim array'imizde bulunuyor mu? Kontrol edelim.
-> Türkiye, Japonya, Moğolistan, Amerika, Rusya, Çin
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		String[] ulkeler={"Türkiye","Japonya","Mogolistan","Amerika","Rusya","Cin"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen bir ulke giriniz");
		String ulkeIsmi=scanner.nextLine();
		boolean mevcutMu=false;
		
		for (int i = 0; i <ulkeler.length ; i++) {
			if (ulkeler[i].equalsIgnoreCase(ulkeIsmi)){
				mevcutMu=true;
				break;
			}
			
		}
		if (mevcutMu){
			System.out.println("ülke mevcuttur");
		}else {
			System.out.println("ülke mevcut değildir");
		}
	}
}