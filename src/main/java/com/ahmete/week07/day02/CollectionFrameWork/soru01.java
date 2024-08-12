package com.ahmete.week07.day02.CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class soru01 {
	public static void main(String[] args) {
		Map<Integer, Map<Integer, Map<Integer, String>>> ucKatmanliMap = new HashMap<>();
		Map<Integer, Map<Integer, String>> ikinciKatman1 = new HashMap<>();
		Map<Integer, String> ucuncuKatman1 = new HashMap<>();
		ucuncuKatman1.put(1, "Merhaba");
		ucuncuKatman1.put(2, "Dünya");
		ikinciKatman1.put(1, ucuncuKatman1);
		
		Map<Integer, Map<Integer, String>> ikinciKatman2 = new HashMap<>();
		Map<Integer, String> ucuncuKatman2 = new HashMap<>();
		ucuncuKatman2.put(1, "Nasılsın");
		ucuncuKatman2.put(2, "Bugün");
		ikinciKatman2.put(2, ucuncuKatman2);
		
		ucKatmanliMap.put(1, ikinciKatman1);
		ucKatmanliMap.put(2, ikinciKatman2);
		
		// Map'in içeriğini klasik foreach döngüsü ile yazdırma
		for (Map.Entry<Integer, Map<Integer, Map<Integer, String>>> birinciSeviye : ucKatmanliMap.entrySet()) {
			System.out.println("Birinci Seviye Anahtar: " + birinciSeviye.getKey());
			
			for (Map.Entry<Integer, Map<Integer, String>> ikinciSeviye : birinciSeviye.getValue().entrySet()) {
				System.out.println("    İkinci Seviye Anahtar: " + ikinciSeviye.getKey());
				
				for (Map.Entry<Integer, String> ucuncuSeviye : ikinciSeviye.getValue().entrySet()) {
					System.out.println("        Üçüncü Seviye Anahtar: " + ucuncuSeviye.getKey() + ", Değer: " + ucuncuSeviye.getValue());
				}
			}
		}
	}
	
}