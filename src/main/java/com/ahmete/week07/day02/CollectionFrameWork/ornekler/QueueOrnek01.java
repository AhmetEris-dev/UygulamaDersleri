package com.ahmete.week07.day02.CollectionFrameWork.ornekler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 1- İçerisinde String isimler tutacak bir queue tanımlayalim. adi biletKuyrugu olsun.
 * kuyruga 10 kisi ekleyelim ve biletSatis isimli bir metotta 1-15 arası random sayida kisiye biletleri dagitalim.
 *
 * Biletini alanlar için; ".. biletini aldı" çıktısı verelim.
 * Bilet bittiginde : "Bilet kalmadi..." ciktisi verelim.
 *
 * Biletini alamayanlari yazdiralim. "... bilet alamadi..."
 */
public class QueueOrnek01 {
	public static void main(String[] args) {
		// Queue tanımlama ve kişileri ekleme
		Queue<String> biletKuyrugu = new LinkedList<>();
		biletKuyrugu.add("Ali");
		biletKuyrugu.add("Ayşe");
		biletKuyrugu.add("Mehmet");
		biletKuyrugu.add("Fatma");
		biletKuyrugu.add("Ahmet");
		biletKuyrugu.add("Cem");
		biletKuyrugu.add("Yasemin");
		biletKuyrugu.add("Kerem");
		biletKuyrugu.add("Zeynep");
		biletKuyrugu.add("Ozan");
		
		biletSatis(biletKuyrugu);
	}
	
	public static void biletSatis(Queue<String> biletKuyrugu) {
		Random random = new Random();
		int satilacakBiletSayisi = random.nextInt(1,16); // 1-15 arası random sayı
		int dagitilanBiletSayisi = 0;
		
		while (!biletKuyrugu.isEmpty() && dagitilanBiletSayisi < satilacakBiletSayisi) {
			String kisi = biletKuyrugu.poll(); // Kuyruktan kişiyi al
			System.out.println(kisi + " biletini aldı.");
			dagitilanBiletSayisi++;
		}
		
		if (biletKuyrugu.isEmpty()) {
			System.out.println("Bilet kalmadı...");
		} else {
			System.out.println("Bilet kalmadı...");
			for (String kisi : biletKuyrugu) {
				System.out.println(kisi + " bilet alamadı...");
			}
		}
	}
}