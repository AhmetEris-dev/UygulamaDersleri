package com.ahmete.week08.day01;

import java.util.*;
import java.util.stream.Collectors;

public class sanslıNumaralarBulma {
	public static void main(String[] args) {
		// 1. Rastgele Sayılar Üretme
		Random random = new Random();
		Map<Integer, Integer> sayiMap = new HashMap<>();
		
		// 1 ile 100 arasında rastgele 10.000 sayı üret
		for (int i = 0; i < 10000; i++) {
			int rastgeleSayi = random.nextInt(100) + 1;
			sayiMap.put(rastgeleSayi, sayiMap.getOrDefault(rastgeleSayi, 0) + 1);
		}
		
		// Üretilen sayılar ve tekrar sayıları
		System.out.println("Üretilen Sayılar ve Tekrar Sayıları:");
		sayiMap.forEach((sayi, tekrarSayisi) -> System.out.println("Sayı: " + sayi + " - Tekrar Sayısı: " + tekrarSayisi));
		
		// 2. Liste Oluşturma
		List<Integer> tekrarListe = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : sayiMap.entrySet()) {
			Integer sayi = entry.getKey();
			Integer tekrarSayisi = entry.getValue();
			for (int i = 0; i < tekrarSayisi; i++) {
				tekrarListe.add(sayi);
			}
		}
		
		// 3. Şanslı Numaraları Bulma
		// Set kullanarak benzersiz 10 şanslı numara seç
		Set<Integer> sansliNumaralar = new HashSet<>();
		Random rand = new Random();
		
		while (sansliNumaralar.size() < 10 && !tekrarListe.isEmpty()) {
			int randomIndex = rand.nextInt(tekrarListe.size());
			sansliNumaralar.add(tekrarListe.get(randomIndex));
		}
		
		System.out.println("Şanslı Numaralar:");
		sansliNumaralar.forEach(sayi -> System.out.print(sayi + " "));
		System.out.println();
		
		// 4. Şanslı Numaralar Üzerinde İşlemler
		List<Integer> ellidenBuyukOlanlar = sansliNumaralar.stream()
		                                            .filter(sayi -> sayi > 50)
		                                            .collect(Collectors.toList());
		
		int toplam = sansliNumaralar.stream().mapToInt(Integer::intValue).sum();
		int ellidenBuyukOlanToplam = ellidenBuyukOlanlar.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("50'den Büyük Şanslı Numaralar:");
		ellidenBuyukOlanlar.forEach(sayi -> System.out.print(sayi + " "));
		System.out.println();
		
		System.out.println("Tüm Şanslı Numaraların Toplamı: " + toplam);
		System.out.println("50'den Büyük Şanslı Numaraların Toplamı: " + ellidenBuyukOlanToplam);
	}
}