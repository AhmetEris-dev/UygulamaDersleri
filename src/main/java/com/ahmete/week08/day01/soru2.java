package com.ahmete.week08.day01;

/*
2-  Disaridan bir String deger alacagiz. Bu String degerdeki her bir harfi kontrol edecegiz. Tekrar edenleri bir sete ,tekrar etmeyenleri ise baska bir sete atalım..
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class soru2 {
	
	public static void main(String[] args) {
		String input = "programlama";
		tekrarKontrol(input);
	}
	
	public static void tekrarKontrol(String input) {
		Set<Character> tekrarEdenler = new HashSet<>();
		Set<Character> tekrarEtmeyenler = new HashSet<>();
		
		for (char ch : input.toCharArray()) {
			if (!tekrarEdenler.contains(ch) && !tekrarEtmeyenler.add(ch)) {
				tekrarEtmeyenler.remove(ch);
				tekrarEdenler.add(ch);
			}
		}
		
		System.out.println("Tekrar edenler: " + tekrarEdenler);
		System.out.println("Tekrar etmeyenler: " + tekrarEtmeyenler);
	}
}