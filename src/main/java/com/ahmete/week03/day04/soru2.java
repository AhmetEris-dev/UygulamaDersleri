package com.ahmete.week03.day04;
/*
2- Kullanicidan 2 ya da 3 adet sayi alacagiz. (Kullanici belirtecek).

2 sayi girilecekse bir metot icerisinde 2 adet sayi alip, toplama islemini yapip sonucu dondurelim.

3 adet sayi girilecekse ayni isimli overloaded bir metot yazalim ve sayilari disaridan parametre olarak overloaded metoda vererek sayilari toplayalim.

Yani;
Main'de kac sayi alacagini ogren. Gelecek sayi miktarina gore kullanacagin metodu sec ve direktiflere gore metodu tasarla.
 */

import java.util.Scanner;

public class soru2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lütfen kac adet sayi toplamak istediğinizi giriniz. (2/3) ");
		int adet=scanner.nextInt(); scanner.nextLine();
		
		switch (adet){
			case 2: {
				System.out.println("lütfen birinci sayiyi giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("lütfen ikinci sayiyi giriniz");
				int sayi2 = scanner.nextInt();
				int sum = sum(sayi1, sayi2);
				System.out.println(sum);
				break;
			}
			case 3:{
				System.out.println("lütfen birinci sayiyi giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("lütfen ikinci sayiyi giriniz");
				int sayi2 = scanner.nextInt();
				System.out.println("lütfen üçüncü sayiyi giriniz");
				int sayi3 = scanner.nextInt();
				int sum=sum(sayi1,sayi2,sayi3);
				System.out.println(sum);
				break;
				
			}
			default:{
				System.out.println("lütfen ddoğru seceneği giriniz");
			}
		}
		
	}
	private static int sum(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	private static int sum(int sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
	}
}