package com.ahmete.week06.day03;

/*
urunlere satın alma sınırı getir
satın almadan önce toplam sepet fiyatını sepet içeriğinde gotruntule
sepet boş ise boş mesajı yazdır

kullanıcı kayıt sistemini sepet uygulamasıyla birbirine entekre edip birbiriyle calısır moduler bir yapı yapın
her kullanıcının kendine ait sepeti her kullanıcı urun listesinden sepete urun ekleyecek her urun
satım alım geçmişi
orjinal 1 adet sepeti olucak
 
 
 kks ile giriş yaptıktan sonra urunler gozuksun sepete giriş yap
 
 kullanıcı giriş yapsın urunleri goruntulesın
 
 kullanıcı giriş yapmadan urunlere gidebilir gecici sepet e urun eklenebilecek satın almak isterse giriş yap ekranına
  götür eğer giriş dogru yapılırsa satın alma onaylanacak hesabı yoksa kayıt ol menusune aktarılacak


 */

import com.ahmete.week06.day03.databases.UrunSepetDetayDB;
import com.ahmete.week06.day03.databases.UrunDB;
import com.ahmete.week06.day03.entities.Kiyafet;
import com.ahmete.week06.day03.entities.UrunSepetDetay;
import com.ahmete.week06.day03.entities.Urun;


import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TredyolAPP {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		AltGiyim alt1 = new AltGiyim(100.98, 1, "patolon", ESize.LARGE, EColor.BLUE);
//		AltGiyim alt2 = new AltGiyim(103.74, 2, "Kot patolon", ESize.MEDIUM,EColor.RED);
//		AltGiyim alt3 = new AltGiyim(131.5, 3, "Şort", ESize.SMALL,EColor.GREEN);
//		AltGiyim alt4 = new AltGiyim(156.11, 4, "Mayo", ESize.LARGE,EColor.RED);
//		UrunDB.urunSave(alt1);
//		UrunDB.urunSave(alt2);
//		UrunDB.urunSave(alt3);
//		UrunDB.urunSave(alt4);
//
//
//		UstGiyim ust1 = new UstGiyim(100.98, 1, "Ceket", ESize.LARGE, EColor.BLUE);
//		UstGiyim ust2 = new UstGiyim(130.98, 3, "T-shirt", ESize.SMALL, EColor.RED);
//		UstGiyim ust3 = new UstGiyim(132.98, 2, "kazak", ESize.MEDIUM, EColor.GREEN);
//		UstGiyim ust4 = new UstGiyim(101.0, 4, "Gömlek", ESize.MEDIUM, EColor.GREEN);
//		UstGiyim ust5 = new UstGiyim(12.00, 6, "atlet", ESize.LARGE, EColor.BLUE);
//
//		UrunDB.urunSave(ust1);
//		UrunDB.urunSave(ust2);
//		UrunDB.urunSave(ust3);
//		UrunDB.urunSave(ust4);
//		UrunDB.urunSave(ust5);
		Locale.setDefault(Locale.UK);
		tredyolMenu();
	}
	
	private static void tredyolMenu() {
		
		int userInput = -1;
		do {
			System.out.println("### TREDYOL MENU ###");
			System.out.println("1.Urunleri Listele");
			System.out.println("2.Ürün numarasi ile detaylı Listele");
			System.out.println("3.Sepet Menu");
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
				System.out.println();
			}
			switch (userInput) {
				case 1: { // Urun listele detaysız id-adi-fiyat
					System.out.println("---- Urunlerin listesi ------");
					UrunDB.urunListAll();
					System.out.println("-----------------------------");
					System.out.println();
					break;
				}
				case 2: { // Sepet urun ekleme
					Urun urun = urunSelectByID();
					sepeteEklenme(urun);
					
					break;
				}
				case 3: { // Sepet görüntüle
					sepetMenu();
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
	
	private static void sepetMenu() {
		int userInput = -1;
		do {
			System.out.println("### SEPET MENU ###");
			System.out.println("1.Sepeti Görüntüle");
			System.out.println("2.Ürün çıkar");
			System.out.println("3.Sepetten ürün sil");
			System.out.println("4.Satın al");
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
				case 1: { // Sepeti Görüntüle
					System.out.println("---- Sepet İçeriği ------");
					UrunSepetDetayDB.sepetListAll();
					System.out.println();
					break;
				}
				case 2: { // Ürün çıkar
					sepettenUrunSil(2);
					break;
				}
				case 3: { // Sepetten ürün sil
					sepettenUrunSil(3);
					break;
				}
				case 4: {
					System.out.println("---- Sepet İçeriği ------");
					List<UrunSepetDetay> sepetList = UrunSepetDetayDB.sepetListAll();
					System.out.println();
					satinAl(sepetList);
					break;
				}
				case 0: {
					System.out.println("Ana Menüye dönülüyor...");
					break;
				}
				default:
					System.out.println("\nGeçerli bir değer giriniz!\n");
			}
		} while (userInput != 0);
	}
	
	private static void satinAl(List<UrunSepetDetay> sepetList) {
		double toplamFiyat = 0.0;
		String UUID = String.valueOf(java.util.UUID.randomUUID());
		int userInput;
		for (UrunSepetDetay sepet: sepetList){
			toplamFiyat += sepet.getToplamFiyat();
		}
		System.out.println("Fatura Numarası: "+ UUID);
		System.out.println("toplam fiyat: "+ toplamFiyat);
		System.out.println("1- satin alma işlemini gerçekleştir");
		System.out.println("0- iptal");
		userInput = sc.nextInt();
		if (userInput == 0){
			System.out.println("geri dönülüyor...");
		}
		else {
			System.out.println("Satin alma işlemi gerçekleştirildi...");
			for (UrunSepetDetay sepet: sepetList){
				UrunDB.updateStok(sepet.getUrunID(), sepet.getSepetAdet());
			}
			UrunSepetDetayDB.removeAllSepet();
		}
		
	}
	
	
	private static Urun urunSelectByID() {
		int id;
		do {
			System.out.println("0-Geri Dön");
			System.out.print("Ürün numarasını giriniz:");
			
			id = sc.nextInt();
			Urun urun = UrunDB.findByID(id);
			if (urun == null) {
				System.out.println("\nBöyle bir ürün yok!\n");
			}
			else {
				System.out.println();
				System.out.println("----- Ürün Detay ------");
				System.out.println(urun.getUrunID() + "- " + urun.getUrunAdi() + " fiyat: " + urun.getFiyat());
				System.out.println("Stok Adedi: " + urun.getStokAdet() +
						                   " Rengi: " + ((Kiyafet) urun).getColor() + " " +
						                   "Beden: " + ((Kiyafet) urun).getSize());
				System.out.println();
				System.out.println("----- AÇIKLAMA ------");
				addUrunDescription(urun);
				System.out.println();
				return urun;
			}
			
		} while (id != 0);
		return null;
	}
	
	private static void addUrunDescription(Urun urun) {
		Random rand = new Random();
		int x= rand.nextInt(101);
		int y= 100-x;
		int[] options={30,60,90};
		int randomIndex=rand.nextInt(options.length);
		int selectedValue = options[randomIndex];
		urun.setUrunDescription(urun.getUrunAdi()+" %"+x+" polyester" + " %"+y +" pamuktan uretilmistir.\n"+
				                        selectedValue+" derecede yikanmasi uygundur."+" 15 gun icinde " +
				                        "ucretsiz iade edebilirsiniz."+" Incelemis oldugunuz urunun satis " +
				                        "fiyatini satici belirlemektedir.");
		System.out.println(urun.getUrunDescription());
	}
	
	private static void sepeteEklenme(Urun urun) {
		int userInput;
		UrunSepetDetay sepetUrun;
		System.out.println("0-Geri Dön");
		System.out.println("1-Ürünü sepete ekle");
		UrunSepetDetay sepet = new UrunSepetDetay();
		System.out.print("Selection: ");
		userInput = sc.nextInt();
		System.out.println();
		if (userInput == 1) {
			int urunStokAdet = urun.getStokAdet();
			System.out.println("Stok Adedi: " + urun.getStokAdet());
			System.out.println();
			if (urunStokAdet == 0){
				System.out.println("Stok'da ürün tükenmiştir!");
				return;
			}
			do {
				System.out.println("0-Geri Dön");
				System.out.print("Gaç dane: ");
				userInput = sc.nextInt();
				if (urunStokAdet < userInput) {
					System.out.println("\nFazla adet girişi yaptınız!\n");
					continue;
				}
				sepetUrun = UrunSepetDetayDB.findBySepetUrunID(urun.getUrunID());
				Double fiyat = urun.getFiyat();
				if (sepetUrun == null) {
					sepet.setUrunID(urun.getUrunID());
					sepet.setUrunAdi(urun.getUrunAdi());
					sepet.setAdetFiyat(fiyat);
					sepet.setSepetAdet(userInput);
					sepet.setToplamFiyat(fiyat, userInput);
					UrunSepetDetayDB.addSepet(sepet);
					return;
				}
				int toplamAdet = sepetUrun.getSepetAdet() + userInput;
				if (toplamAdet > urunStokAdet) {
					System.out.println("\nStokda yeteri kadar ürün yok.\n");
					continue;
				}
				sepetUrun.setSepetAdet(toplamAdet);
				sepet.setToplamFiyat(fiyat, userInput);
				return;
				
			} while (userInput != 0);
		}
	}
	
	private static void sepettenUrunSil(int userRmSelection) {
		System.out.println("---- Sepet İçeriği ------");
		UrunSepetDetayDB.sepetListAll();
		System.out.println();
		int userInput;
		boolean silindiMi = false;
		
		if (userRmSelection == 2) {
			System.out.print("Eksiltmek istediğiniz ürünün ürünID: ");
			userInput = sc.nextInt();
			UrunSepetDetay sepetUrun = UrunSepetDetayDB.findBySepetUrunID(userInput);
			if (sepetUrun == null) {
				System.out.println("Sepette böyle bir ürün yok!");
			}
			else {
				System.out.print("Eksitmek istediginiz miktar: ");
				userInput = sc.nextInt();
				silindiMi = UrunSepetDetayDB.sepettenUrunEksilt(sepetUrun, userInput);
			}
		}
		else if (userRmSelection == 3) {
			System.out.println("1-Bütün sepeti sil");
			System.out.println("2-Bir ürün sil");
			System.out.print("selection:");
			userInput = sc.nextInt();
			if (userInput == 1) {
				UrunSepetDetayDB.removeAllSepet();
				silindiMi = true;
			}
			else if (userInput == 2) {
				System.out.print("Silmek istediğiniz sepet ID: ");
				userInput = sc.nextInt();
				silindiMi = UrunSepetDetayDB.removeSepetUrunBySepetDetayID(userInput);
			}
		}
		if (silindiMi) {
			System.out.println("silme işlemi gerçekleştirildi!");
		}
		else {
			System.out.println("Sepette böyle bir ürün yok yada girdiğiniz adet miktarı fazla!");
		}
	}
	
	
}