package com.ahmete.week02.day02;

import java.util.Scanner;

public class soru4 {
	/*
	Kulanıcının girdiği sayının çarpım tablosunu yazdıran program.
     (Kullanıcı 7 girdiğinde 7'nin çarpım tablosu elemanları görünecek. )
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "\tx\t" + sayi + "\t=\t" + (i * sayi));
		}
	}
}