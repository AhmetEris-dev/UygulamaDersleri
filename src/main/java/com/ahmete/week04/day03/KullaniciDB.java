package com.ahmete.week04.day03;

public class KullaniciDB {
	static KullaniciOzelListe kullaniciOzelListe = new KullaniciOzelListe();
	
	
	static Kullanici save(Kullanici kullanici){
		return kullaniciOzelListe.add(kullanici);
	}
	
	static Kullanici[] findAll(){
		Kullanici[] kullaniciDizisi = kullaniciOzelListe.getKullaniciDizisi();
		for(Kullanici kullanici : kullaniciDizisi){
			System.out.println(kullanici);
		}
		return kullaniciDizisi;
	}


}