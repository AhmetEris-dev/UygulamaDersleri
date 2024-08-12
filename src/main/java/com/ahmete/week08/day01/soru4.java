package com.ahmete.week08.day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class soru4 {
	public static void main(String[] args) {
		// Öğrenciler ve notlar dizilerini tanımla
		String[] ogrenciler = { "Ayse", "Ece", "Mahmut" };
		int[][] notlar = { { 50, 60, 60 }, { 60, 40, 80 }, { 80, 90, 100 } };
		
		// Öğrenciler ve notları saklamak için bir Map oluştur
		Map<String, List<Integer>> ogrenciNotlarMap = new HashMap<>();
		
		// Öğrenci isimlerini ve notları Map'e ekle
		for (int i = 0; i < ogrenciler.length; i++) {
			List<Integer> notListesi = new ArrayList<>();
			for (int j = 0; j < notlar[i].length; j++) {
				notListesi.add(notlar[i][j]);
			}
			ogrenciNotlarMap.put(ogrenciler[i], notListesi);
		}
		
		
		for (Map.Entry<String, List<Integer>> entry : ogrenciNotlarMap.entrySet()) {
			String ogrenci = entry.getKey();
			List<Integer> notListesi = entry.getValue();
			System.out.println(ogrenci + ": ");
			for (int j = 0; j < notListesi.size(); j++) {
				System.out.println("  Not " + (j + 1) + ": " + notListesi.get(j));
			}
			System.out.println(); // Her öğrenci için bir boşluk bırak
		}
	}
}