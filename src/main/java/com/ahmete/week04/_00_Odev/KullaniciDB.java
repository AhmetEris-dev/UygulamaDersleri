package com.ahmete.week04._00_Odev;

public class KullaniciDB {
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	
	static Kullanici save(Kullanici kullanici) {
		
		return kullaniciOzelListe.add(kullanici);
	}
	
	static Kullanici[] findAll() {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null) {
			System.out.println("kullanıcı yok");
			return null;
		}
		for (Kullanici kullanici : kullaniciDizisi) {
			System.out.println(kullanici);
		}
		return kullaniciDizisi;
	}
	
	static boolean emailBul(String email) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null) {
			return false;
		}
		for (Kullanici kullanici : kullaniciDizisi) {
			if (kullanici.getEmail().equals(email)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static int kullaniciIndexBul(String kullaniciAdi) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null) {
			return -1;
		}
		for (int i = 0; i < kullaniciDizisi.length; i++) {
			if (kullaniciDizisi[i].getKullaniciAdi().equals(kullaniciAdi)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean kullaniciDogruMu(String sifre, int kullaniciIndex) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi[kullaniciIndex].getSifre().equals(sifre)) {
			return true;
		}
		return false;
	}
	
	public static int kullaniciTcKimlikIndex(String kullaniciTcKimlik) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null) {
			return -1;
		}
		for (int i = 0; i < kullaniciDizisi.length; i++) {
			if (kullaniciDizisi[i].getTcKimlik().equals(kullaniciTcKimlik)) {
				return i;
			}
		}
		return -1;
	}
	
	public static void sifreyiGuncelle(String yeniSifre, int kullaniciIndex) {
		Kullanici[] kullaniciDizisi= kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi != null) {
			kullaniciDizisi[kullaniciIndex].setSifre(yeniSifre);
		}
	}
	
	public static boolean tcKimlikBul(String tcKimlik) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null){
			return false;
		}
		for(Kullanici user : kullaniciDizisi){
			if (user.getTcKimlik().equals(tcKimlik)){
				return true;
			}
		}
		return false;
	}
	
	public static boolean kullaniciAdiBul(String kullaniciAdi) {
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		if (kullaniciDizisi == null){
			return false;
		}
		for(Kullanici kullanici : kullaniciDizisi){
			if (kullanici.getKullaniciAdi().equals(kullaniciAdi)){
				return true;
			}
		}
		return false;
	}
}