package com.ahmete.week02.day04;

import java.util.Scanner;

public class soru1 {
	/*
	Dışarıdan bir string girdisi alalım. Bu stringin her bir harfini, bulunduğu index ile birlikte alt alta
	yazdıracağım.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir kelime yazın");
		String kelime = scanner.nextLine();
		System.out.println("karakter\tindex");
		
		for (int i = 0; i < kelime.length(); i++) {
			char ch = kelime.charAt(i);
			System.out.println(ch + "\t\t\t" + i);
		}
		
		
	}
}