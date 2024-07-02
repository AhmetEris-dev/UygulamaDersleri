package com.ahmete.week02.day01;

import java.util.Scanner;

public class soru7 {
	/*
	* dırsarıdan girilen bir sayinin faktoriyelini alalım
	*/
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("lutfen faktoriyelinin hesaplanmasını istediğiniz sayiyi giriniz: ");
		int number= scanner.nextInt();
		int factorial=1;
		
		for (int i = 2; i <=number ; i++) {
			factorial*=i;
		}
		System.out.println("girdiğiniz sayinin faktoriyeli: "+factorial);
	}
}