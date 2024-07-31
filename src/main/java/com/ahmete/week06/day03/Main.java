package com.ahmete;

import com.ahmete.week06.day03.databases.UrunDB;
import com.ahmete.week06.day03.entities.Urun;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		tredyolMenu();
	}
	private static void tredyolMenu() {
		int userInput = -1;
		do {
			System.out.println("### TREDYOL MENU ###");
			System.out.println("1.Urunleri Listele");
			System.out.println("2.ID ile detaylı Listele");
			System.out.println("3.Sepeti Görüntüle");
			System.out.println("0.Çıkış");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("\nGeçerli bir değer giriniz!\n");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userInput) {
				case 1: { // Urun listele detaysız id-adi-fiyat
					System.out.println("---- Urunlerin listesi ------");
					UrunDB.urunListAll();
					
					break;
				}
				case 2: { // Sepet urun ekleme
					/*
					 * Urunleri listele id - tür - adi - ürün adedi - fiyati
					 * id seçimi ile sepete kaç tane ürün eklememiz gerektiğini soracak
					 * ekleme işlemini sepetDB içerisine ArrayList ile gerçekleştir.
					 * Ekleme işlemi ürün adet
					 * SepetAdet = ürün adetlerin toplami
					 * toplamFiyat = ürün fiyatlarin toplami
					 * */
					urunSelectByID();
					
					break;
				}
				case 3: { // Sepet görüntüle
					break;
				}
				case 9:{
					UrunDB.generateAltGiyim(10);
					UrunDB.generateUstGiyim(5);
					break;
				}
				case 0: {
					System.out.println("Gülü gülü!");
					break;
				}
				default:
					System.out.println("\nGeçerli bir değer giriniz!\n");
			}
		} while (userInput != 0);
	}
	
	private static void urunSelectByID() {
		System.out.print("Ürün sıra numarasını giriniz:");
		int id = sc.nextInt();
		Urun urun = UrunDB.findByID(id);
		if (urun == null){
			System.out.println("Böyle bir ürün yok!");
		}
		
		//TODO: Listeleme sout yap.
	}
	
	
}