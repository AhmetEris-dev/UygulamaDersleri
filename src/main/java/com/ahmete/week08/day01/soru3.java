package com.ahmete.week08.day01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class soru3 {
	public static void main(String[] args) {
		// Kullanıcıdan kelimeyi al
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Bir kelime girin: ");
		String girilenKelime = inputScanner.nextLine();
		
		// Kelimeyi küçük harfe dönüştür
		String kelimeKucukHarf = girilenKelime.toLowerCase();
		
		// Harf frekanslarını saklamak için bir Map oluştur
		Map<Character, Integer> harfFrekansMap = new LinkedHashMap<>();
		
		// Her harfi kontrol et ve frekansını artır
		for (char harf : kelimeKucukHarf.toCharArray()) {
			
			harfFrekansMap.put(harf, harfFrekansMap.getOrDefault(harf, 0) + 1);
		}
		harfFrekansMap.forEach((k,v)-> System.out.println(k+" "+v));
	}
	
}