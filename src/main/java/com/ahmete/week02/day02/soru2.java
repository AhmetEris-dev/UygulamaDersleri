package com.ahmete.week02.day02;

public class soru2 {
	/*
	a'dan z'ye alfabeyi yazdıralım.
	 */
	public static void main(String[] args) {
		char baslangic = 'a';
		char bitis = 'z';
		int sayi = baslangic + 10;
		for (; baslangic <= bitis;baslangic++ ) {
			System.out.println(baslangic + "");
		}
		
		
	}
}