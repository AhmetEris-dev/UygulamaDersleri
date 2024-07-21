package com.ahmete.week04._00_Odev;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class KullaniciKayitSistemi {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
	menu();
	}
	
	public static void menu(){
		int secim = -1;
		do {
			System.out.println("\n### KULLANICI KAYIT SISTEMI ###");
			System.out.println("1- Kayit Ol");
			System.out.println("2- Giris Yap");
			System.out.println("3- Sifremi unuttum");
			System.out.println("4- kullanıcıları listele");
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
				 kullaniciKaydi();
				
				break;
			}
			case 2: {
				kullaniciGiris();
				break;
			}
			case 3:{
				unutulmusSifreyiDegistir();
				break;
			}
			case 4:{
				KullaniciDB.findAll();
				break;
			}
			case 0:{
				System.out.println("Programdan cıkış yapılıyor...");
			}
			default:
				System.out.println("lütfen gecerli bir secim yapınız!!!");
			
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
			kullanici.setSoyisim(isimSoyisim[1]);

			// email alma
			kullanici.setEmail(emailAl());
			// telefon numarası alma
			kullanici.setTelNo(telNoAl());
			// sifre alma
			kullanici.setSifre(sifreAl());
			// kullanıcı adı alma
			kullanici.setKullaniciAdi(kullaniciAdiAl(true));
			// tc kimlik no alma
			kullanici.setTcKimlik(tcKimlikAl(true));
			KullaniciDB.save(kullanici);
			return kullanici;
		} else{
			System.out.println("18 Yasindan kucukler kayit islemi gerceklestiremez.");
		}
		return null;
	}
	private static int kullaniciGiris(){
		String kullaniciAdi;
		String sifre;
		int kullaniciIndex;
		kullaniciAdi=kullaniciAdiAl(false);
		kullaniciIndex=KullaniciDB.kullaniciIndexBul(kullaniciAdi);
		for (int i = 0; i <3 ; i++) {
			System.out.println("lütfen şifrenizi giriniz");
			sifre=scanner.nextLine();
			if (KullaniciDB.kullaniciDogruMu(sifre,kullaniciIndex)){
				System.out.println("Başarıyla giriş yaptınız!");
				return kullaniciIndex;
			}
			System.out.println((i+1)+". yanlış şifre girdiniz ");
		}
		System.out.println("3 defa yanlış giriş yaptınız. girişiniz bloke edilmiştir");
		return -1;
	}
	private static void unutulmusSifreyiDegistir(){
		int kullaniciIndex;
		String kullaniciTcKimlik;
		String kullaniciAdi;
		while (true){
			kullaniciTcKimlik=tcKimlikAl(false);
			kullaniciAdi= kullaniciAdiAl(false);
			kullaniciIndex=KullaniciDB.kullaniciTcKimlikIndex(kullaniciTcKimlik);
			if (!KullaniciDB.kullaniciDogruMu(kullaniciAdi, kullaniciIndex)){
				System.out.println("kullanıcı no ile kullanıcı adı eşleşmemiştir");
			}
			else {
				break;
			}
		}
		String yeniSifre=sifreAl();
		KullaniciDB.sifreyiGuncelle(yeniSifre,kullaniciIndex);
	}
	private static String tcKimlikAl(boolean ilkMi) {
		String tcKimlik;
		while (true){
			System.out.println("lütfen bir tc kimlik no  giriniz : ");
			tcKimlik=scanner.nextLine();
			if (!numerikDegerKontrol(tcKimlik)) {
				System.out.println("TC Kimlik no sadece numerik karakterler barındırabilir. ");
				continue;
			}
			else if (tcKimlik.length()!=11){
				System.out.println("TC kimlik no 11 haneli olmalıdır.");
				continue;
			}
			if (ilkMi){
				if (KullaniciDB.tcKimlikBul(tcKimlik)){
					System.out.println("bu tc kimlik başkasına aittir lütfen doğru bir tc kimlik giriniz");
					continue;
				}
				return tcKimlik;
			}
			if (!KullaniciDB.tcKimlikBul(tcKimlik)){
				System.out.println("yanlış tc kimlik. uygulamada böyle bir kullanıcı tc kimliği yok");
				continue;
			}
			return tcKimlik;
		}
		
		
	}
	private static boolean numerikDegerKontrol(String deger){
		for (int i = 0; i <deger.length() ; i++) {
			if (!Character.isDigit(deger.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	private static String kullaniciAdiAl(boolean ilkMi) {
		String kullaniciAdi;
		while (true){
			System.out.println("lütfen bir kullanıcı adı giriniz min 4 - max 16 karakter: ");
			kullaniciAdi=scanner.nextLine();
			if (kullaniciAdi.length()<4){
				System.out.print("kullanıcı adı 4 karakterden kısa olamaz!");
				continue;
			}
			if (kullaniciAdi.length()>16) {
				System.out.print("kullanıcı adı 16 karakterden uzun olamaz!");
				continue;
			}
			if (ilkMi){
				if (KullaniciDB.kullaniciAdiBul(kullaniciAdi)){
					System.out.println("bu kullanıcı adı daha önce alınmış. Lütfen farklı bir kullanıcı adı giriniz");
					continue;
				}return kullaniciAdi;
			}
			if (!KullaniciDB.kullaniciAdiBul(kullaniciAdi)){
				System.out.println("Yanlış kullanıcı adı bu kullanıcı adında bir kullanıcı bulunmamakta");
				continue;
			}
			return kullaniciAdi;
		}
	}
	
	private static String sifreAl() {
		
		String sifre;
		String sifreYeniden;
		while (true){
			System.out.print("lütfen bir sifre giriniz min 8 - max 32 karakter: ");
			sifre=scanner.nextLine();
			if (sifre.length()<8){
				System.out.println("sifre 8 karakterden kısa olamaz!");
				continue;
			}else if (sifre.length()>32){
				System.out.println("sifre 32 karakterden uzun olamaz!");
				continue;
			}else {
				System.out.print("lütfen sifrenizi tekrar giriniz!");
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
		boolean emailDogruMu=false;
		do {
			System.out.print("lütfen emailinizi giriniz");
			String email=scanner.nextLine();
			emailDogruMu=emailKontrol(email);
			boolean emailVarMi=KullaniciDB.emailBul(email);
			if (emailDogruMu && emailVarMi){
				return email;
			}
			if (emailVarMi){
				System.out.println("bu email zaten kullanılmakta lütfen başka bir email adresi deneyiniz");
				emailVarMi=false;
			}
		}while (emailDogruMu);
		return null;
	}
	// TODO substring ile dene
	private static boolean emailKontrol(String email){
		if (!email.contains("@")){
			System.out.println("lütfen gecerli bir email adresi giriniz");
			return true;
		}
		return false;
	}
	
	private static String[] isimSoyisimAl() {
		String[] isimSoyisim=new String[2];
		
		System.out.print("lütfen adınızı giriniz: ");
		isimSoyisim[0]=scanner.nextLine();
		System.out.print("lütfen soyisim giriniz: ");
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