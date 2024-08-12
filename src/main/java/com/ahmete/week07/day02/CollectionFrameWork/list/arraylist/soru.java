package com.ahmete.week07.day02.CollectionFrameWork.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class soru {
	public static void main(String[] args) {
		// 1. Öğrenci listesi oluşturma
		List<Ogrenci> ogrenciListesi = new ArrayList<>();
		
		// 2. Öğrenci ekleme
		ogrenciListesi.add(new Ogrenci("Ali", "Yılmaz"));
		ogrenciListesi.add(new Ogrenci("Ayşe", "Demir"));
		ogrenciListesi.add(new Ogrenci("Ahmet", "Kaya"));
		ogrenciListesi.add(new Ogrenci("Fatma", "Sarı"));
		
		// 3. Listeyi yazdırma
		System.out.println("Öğrenci Listesi:");
		for (Ogrenci ogrenci : ogrenciListesi) {
			System.out.println(ogrenci);
		}
		
		// 4. Belirli bir öğrenciye erişme
		Ogrenci ogrenci = ogrenciListesi.get(2);
		System.out.println("3. Öğrenci: " + ogrenci);
		
		// 5. Liste boyutunu öğrenme
		int listeBoyutu = ogrenciListesi.size();
		System.out.println("Liste Boyutu: " + listeBoyutu);
		
		// 6. Belirli bir öğrenciyi güncelleme
		ogrenciListesi.set(1, new Ogrenci("Zeynep", "Çelik"));
		System.out.println("Güncellenmiş Öğrenci Listesi:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
		
		// 7. Belirli bir öğrenciyi silme
		ogrenciListesi.remove(3); // 4. sıradaki öğrenci siliniyor
		System.out.println("Öğrenci Silindikten Sonra:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
		
		// 8. Listeyi döngü ile gezinme
		System.out.println("Listeyi Döngü İle Gezinme:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
		
		// 9. Listenin boş olup olmadığını kontrol etme
		boolean isEmpty = ogrenciListesi.isEmpty();
		System.out.println("Liste Boş mu?: " + isEmpty);
		
		// 10. Listeyi başka bir listeye kopyalama
		List<Ogrenci> yeniOgrenciListesi = new ArrayList<>(ogrenciListesi);
		System.out.println("Yeni Öğrenci Listesi:");
		for (Ogrenci ogr : yeniOgrenciListesi) {
			System.out.println(ogr);
		}
		
		// 11. Öğrencinin listede bulunup bulunmadığını kontrol etme
		Ogrenci kontrolOgrenci = new Ogrenci("Ali", "Yılmaz");
		boolean varMi = ogrenciListesi.contains(kontrolOgrenci);
		System.out.println("Öğrenci Listede Var mı?: " + varMi);
		
		// 12. Listeyi alt listeye bölme
		List<Ogrenci> altListe = ogrenciListesi.subList(0, 2);
		System.out.println("Alt Liste:");
		for (Ogrenci ogr : altListe) {
			System.out.println(ogr);
		}
		
		// 13. Listeyi diziye dönüştürme
		Ogrenci[] ogrenciDizisi = ogrenciListesi.toArray(new Ogrenci[0]);
		System.out.println("Listeyi Diziye Dönüştürme:");
		for (Ogrenci ogr : ogrenciDizisi) {
			System.out.println(ogr);
		}
		
		// 14. Listeyi ters çevirme
		Collections.reverse(ogrenciListesi);
		System.out.println("Ters Çevrilmiş Liste:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
		System.out.println("------ sıralama------");
		// 15. Listeyi sıralama (İsme göre sıralama)
		Collections.sort(ogrenciListesi, (o1, o2) -> o1.getAd().compareTo(o2.getAd()));
		System.out.println("Sıralanmış Liste:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
		
		// 16. Öğrenci indeksini bulma
		int indeks = ogrenciListesi.indexOf(new Ogrenci("Ahmet", "Kaya"));
		System.out.println("Ahmet Kaya'nın İndeksi: " + indeks);
		
		// 17. Listeyi birleştirme
		List<Ogrenci> ekstraOgrenciler = new ArrayList<>();
		ekstraOgrenciler.add(new Ogrenci("Mehmet", "Taş"));
		ekstraOgrenciler.add(new Ogrenci("Elif", "Gül"));
		
		ogrenciListesi.addAll(ekstraOgrenciler);
		System.out.println("Birleştirilmiş Liste:");
		for (Ogrenci ogr : ogrenciListesi) {
			System.out.println(ogr);
		}
	}
}