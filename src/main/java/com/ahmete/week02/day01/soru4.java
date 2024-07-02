package com.ahmete.week02.day01;

import java.util.Scanner;

public class soru4 {
	/*
	*kullanıcıdan önce yasını sonrasında kullanıcının ismini girdi olarak isteyelim ve yasını ekrana yazdıralım
	*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("lütfen yasinizi giriniz; ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("lütfen adinizi giriniz; ");
		String name = scanner.nextLine();
		scanner.close();
		System.out.println(name + " " + age);
	}
}