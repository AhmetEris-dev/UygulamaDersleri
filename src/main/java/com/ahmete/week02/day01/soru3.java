package com.ahmete.week02.day01;

public class soru3 {
	/*
	* iki tane string değişken (isim ve soyisim) bu değişkenleri yazdıralım
	* bu değişkenleri tek bir cıktıda alt alta yazdıralım
	* a ve b karakterlerinin degerini ve karakterler deger toplamını yazdıralım
	*/
	public static void main(String[] args) {
		String name = "Ahmet";
		String surname = "Eriş";
		System.out.println(name + " " + surname);
		
		System.out.println(name + "/n" + surname); // /n alt satıra yazdırmanı sağlar.
		
		
		
		char a='a';
		char b ='b';
		System.out.println((int)a);
		System.out.println((int)b);
		char aa =(char) (a-32);
		System.out.println((int)aa);
	}
}