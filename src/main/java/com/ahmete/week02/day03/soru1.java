package com.ahmete.week02.day03;

import java.util.Scanner;

public class soru1 {
	/*
	 *Kullanıcıdan 1'den 7'ye kadar bir sayı isteyelim. Bu sayıya denk gelen haftanın gününü çıktı olarak verelim
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1 den 7 ye kadar bir sayi giriniz.");
		
		int gun,sayi;
		sayi= scanner.nextInt();
		gun = sayi;
		
		String gunTip = switch (gun) {
			case 1 -> "pazartesi";
			case 2 -> "salı";
			case 3 -> "çarşamba";
			case 4 -> "perşembe";
			case 5 -> "cuma";
			case 6 -> "cumartesi";
			case 7 -> "pazar";
			
			default -> "1 ile 7 arasında değer girebilirsiniz";
		};
		
		System.out.println(gunTip);
	}
}