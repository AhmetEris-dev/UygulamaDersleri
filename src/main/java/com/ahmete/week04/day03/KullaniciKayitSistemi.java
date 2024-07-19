package com.ahmete.week04.day03;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KullaniciKayitSistemi {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//        Kullanici kullanici1= new Kullanici();
//        Kullanici kullanici2 = new Kullanici();
//
//        System.out.println("Id: " + kullanici1.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " +kullanici1.getKayitTarihi());
//        System.out.println("Id: " + kullanici2.getId() + " kullaniciCount : " + Kullanici.getKullaniciCount() + " kayitTarihi : " +kullanici2.getKayitTarihi());
//
//        System.out.print("Lutfen telno giriniz : +90 ");
//        scanner.nextLine();
	
	}
	
	public static void menu(){
		int secim = 0;
		do {
			System.out.println("### KULLANICI KAYIT SISTEMI ###");
			System.out.println("1- Kayit Ol");
			System.out.println("0- Cikis");
			System.out.print("Lutfen bir secim yapiniz : ");
			secim = scanner.nextInt();
			scanner.nextLine();
			durum(secim);
			
			
		} while (secim != 0);
		
	}
	
	private static void durum(int secim) {
		switch (secim){
			case 1: {
				Kullanici kullanici = kullaniciKaydi();
				break;
			}
		}
	}
	
	private static Kullanici kullaniciKaydi() {
		
		LocalDate dogumTarihi;
		Kullanici kullanici;
		dogumTarihi = dogumTarihiAl();
		if(dogumTarihKontrol(dogumTarihi)){
			// dogum tarihini kontolunu gectik o zaman kullanıcı oluşturabiliriz
			kullanici = new Kullanici();
			kullanici.setDogumTarihi(dogumTarihi);
			
			//isim soyisim alma
			String[] isimSoyisim=isimSoyisimAl();
			kullanici.setIsim(isimSoyisim[0]);
			kullanici.setIsim(isimSoyisim[1]);
			
			// email alma
			kullanici.setEmail(emailAl());
			// telefon numarası alma
			kullanici.setTelNo(telNoAl());
			// sifre alma
			kullanici.setSifre(sifreAl());
			// kullanıcı adı alma
			kullanici.setKullaniciAdi(kullaniciAdiAl());
			// tc kimlik no alma
			kullanici.setTcKimlik(tcKimlikAl());
			
			
		} else{
			System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
		}
		return null;
	}
	
	private static String tcKimlikAl() {
		String tcKimlik;
		while (true){
			System.out.println("lütfen bir tc kimlik no  giriniz : ");
			tcKimlik=scanner.nextLine();
			if (tcKimlik.length()!=11){
				System.out.println("TC kimlik no 11 haneli olmalıdır.");
				continue;
			}
			else if (!numerikDegerKontrol(tcKimlik)) {
				System.out.println("TC Kimlik no sadece numerik karakterler barındırabilir. ");
				continue;
			
			}
			return tcKimlik;
		}
		
	}
	private static boolean numerikDegerKontrol(String deger){
		for (int i = 0; i <deger.length() ; i++) {
			if (Character.isDigit(deger.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	private static String kullaniciAdiAl() {
		String kullaniciAdi;
		while (true){
			System.out.println("lütfen bir sifre giriniz min 4 - max 16 karakter: ");
			kullaniciAdi=scanner.nextLine();
			if (kullaniciAdi.length()<4){
				System.out.println("sifre 4 karakterden kısa olamaz!");
				continue;
			}else if (kullaniciAdi.length()>16) {
				System.out.println("sifre 16 karakterden uzun olamaz!");
				continue;
			}
			return kullaniciAdi;
		}
	}
	
	private static String sifreAl() {
		
		String sifre;
		String sifreYeniden;
		while (true){
			System.out.println("lütfen bir sifre giriniz min 8 - max 32 karakter: ");
			sifre=scanner.nextLine();
			if (sifre.length()<8){
				System.out.println("sifre 8 karakterden kısa olamaz!");
				continue;
			}else if (sifre.length()>32){
				System.out.println("sifre 32 karakterden uzun olamaz!");
				continue;
			}else {
				System.out.println("lütfen sifrenizi tekrar giriniz!");
				sifreYeniden=scanner.nextLine();
				if (sifre.equals(sifreYeniden)){
					return sifre;
				}else {
					System.out.println("girdiğiniz sifreler eşleşmiyor!");
				}
			}
		}
		
	}
	
	private static String telNoAl() {
		System.out.print("lütfen telefon numarınızı giriniz: +90 ");
		String telNo=scanner.nextLine();
		return telNo;
	}
	
	private static String emailAl() {
		System.out.print("lütfen emailinizi giriniz");
		String email=scanner.nextLine();
		return email;
	}
	
	private static String[] isimSoyisimAl() {
		String[] isimSoyisim=new String[2];
		
		System.out.print("lütfen adınızı giriniz: ");
		isimSoyisim[0]=scanner.nextLine();
		System.out.print("lütfen adınızı giriniz: ");
		isimSoyisim[1]=scanner.nextLine();
		
		return isimSoyisim;
	}
	
	
	private static LocalDate dogumTarihiAl() {
		while (true){
			System.out.print("Lutfen dogum tarihinizi giriniz (yyyy-MM-dd) : ");
			String date = scanner.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			} catch (Exception e){
				System.out.println("Lutfen dogum tarihinizi yil-ay-gun formatinda giriniz!!!\n");
			}
		}
	}
	
	private static boolean dogumTarihKontrol(LocalDate date) {
		int yas = Period.between(date,LocalDate.now()).getYears();
		boolean resitMi = (yas<18) ? false : true;
		return resitMi;
	}
	
	
	
}