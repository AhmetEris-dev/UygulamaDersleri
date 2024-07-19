package com.ahmete.week03.day04;
/*
3- Kullanici disaridan bir sayi girecek.

Ornek girdi = 10;
Sirasiyla;
1- 10 + 50
2- (10+50) * 30
3- ((10+50)*30) -40
4- (((10+50)*30) -40) / 20
islemlerini yaptiracagiz.

Bu islemleri tek bir satirda, metotlara, diger metotlari parametre olarak gecerek gerceklestirelim.
 */

import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int sayi=scanner.nextInt();
		System.out.println("sonuc: "+yirmiBol(kirkCikart(otuzKati(elliEkle(sayi)))));
	
	}
	public static int elliEkle(int sayi){
		return sayi+50;
	}
	public static int otuzKati(int sayi){
		return sayi*30;
	}
	public static int kirkCikart(int sayi){
		return sayi-40;
	}
	public static double yirmiBol(int sayi){
		return sayi/20.0;
	}
}