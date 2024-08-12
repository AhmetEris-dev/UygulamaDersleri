package com.ahmete.week08.day01;
/*
Bir film uygulaması için String kategori tuttuğumuzu düşünün. Kullanıcıdan kategori alıp bu kategoriyi bir collection yapısına ekleyeceğimiz bir metot yazalım. Bu metot, eğer kategori daha önce eklenmemişse başarıyla eklendiğine dair bir mesaj döndürmelidir. Eğer kategori daha önce eklenmişse, bununla ilgili bir uyarı mesajı döndürmelidir.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class soru1 {
	public static void main(String[] args) {
		Set<String> kategoriler = new HashSet<>();
		
		String kategori1 = "Aksiyon";
		String kategori2 = "Dram";
		String kategori3 = "Aksiyon"; // Aynı kategori tekrar eklenmeye çalışılacak
		
		kategoriEkle(kategoriler, kategori1);
		kategoriEkle(kategoriler, kategori2);
		kategoriEkle(kategoriler, kategori3);
	}
	
	// Kategori ekleme metodunu oluşturuyoruz
	public static void kategoriEkle(Set<String> kategoriler, String kategori) {
		if (kategoriler.add(kategori)) {
			System.out.println("Kategori başarıyla eklendi: " + kategori);
		} else {
			System.out.println("Bu kategori zaten eklenmiş: " + kategori);
		}
	}
}