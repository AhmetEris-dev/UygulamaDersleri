package com.ahmete.week07.day02.CollectionFrameWork.ornekler;

import java.util.Scanner;
import java.util.Stack;

/**
 * 2- Disaridan bir metin girelim. Girdigimiz metni bir stack'e bir metot araciligiyla atayalim.
 * Stack<> stack = new Stack();
 * ihtiyacimiz olacak stack metotlari;
 * .pop
 * .push
 * metotlarin nasil kullanildigini dokumantasyon araciligiyla ogrenebilirsiniz.
 * sonra girilen kelimenin palindrom kontrolu icin isPalindrome metoduna kelimeyi gonderelim ve stack kullanarak palindrom kontrolümüzü gerceklestirelim
 */
public class StackOrnek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir kelime giriniz: ");
		String kelime = scanner.nextLine();
		
		// Stack oluşturma ve kelimeyi stack'e ekleme
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < kelime.length(); i++) {
			stack.push(kelime.charAt(i));
		}
		
		// Palindrom kontrolü
		boolean palindromMu = true;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) != stack.pop()) {
				palindromMu = false;
				break;
			}
		}
		
		// Sonuç çıktısı
		if (palindromMu) {
			System.out.println("Girdiğiniz kelime palindromdur.");
		} else {
			System.out.println("Girdiğiniz kelime palindrom değildir.");
		}
	}
}