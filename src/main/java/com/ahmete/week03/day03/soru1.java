package com.ahmete.week03.day03;
/*
1- İki sayıyla 4 işlem yapabilen bir hesap makinesi uygulaması yapalım. Uygulama kullanıcı çıkış yapmadıgı sürece çalışmaya devam edecek. 4 işlem için metotlardan faydalanalım.
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int secim;
		boolean menuKontrol=true;
		while (menuKontrol){
			System.out.println("\n-----MENU-----");
			System.out.println("1-Toplama işlemi");
			System.out.println("2-Cıkarma işlemi");
			System.out.println("3-Carpma işlemi");
			System.out.println("4-Bölme işlemi");
			System.out.println("0_Cıkıs yap");
			System.out.println("lütfen yapma istediğiniz işlemi seciniz");
			 secim=scanner.nextInt();
			 scanner.nextLine();
			 
			 switch (secim){
				 case 1:{
					 System.out.println("lütfen toplamak istediğiniz birinci sayiyi giriniz");
					 int sayi1=scanner.nextInt();
					 System.out.println("lütfen toplamak istediğiniz ikinci sayiyi giriniz");
					 int sayi2=scanner.nextInt();
					 int toplam=topla(sayi1,sayi2);
					 System.out.println("sonuc: "+toplam);
					 break;
				 }
				 case 2:{
					 System.out.println("lütfen cıkarmak istediğiniz birinci sayiyi giriniz");
					 int sayi1=scanner.nextInt();
					 System.out.println("lütfen cıkarmak istediğiniz ikinci sayiyi giriniz");
					 int sayi2=scanner.nextInt();
					 
					 int cikarma=cikar(sayi1,sayi2);
					 System.out.println("sonuc: "+cikarma);
					 break;
						
				 }
				 case 3:{
					 System.out.println("lütfen carpmak istediğiniz birinci sayiyi giriniz");
					 int sayi1=scanner.nextInt();
					 System.out.println("lütfen carpmak istediğiniz ikinci sayiyi giriniz");
					 int sayi2=scanner.nextInt();
					 
					 int carpma=carp(sayi1,sayi2);
					 System.out.println("sonuc: "+carpma);
					 break;
				 }
				 case 4:{
					 System.out.println("lütfen bölmek istediğiniz birinci sayiyi giriniz");
					 int sayi1=scanner.nextInt();
					 System.out.println("lütfen bölmek istediğiniz ikinci sayiyi giriniz");
					 int sayi2=scanner.nextInt();
					 
					 int bolme=bol(sayi1,sayi2);
					 System.out.println("sonuc: "+bolme);
					 break;
					 
					 
				 }
				 case 0:{
					 menuKontrol=false;
					 System.out.println("program sonlandırıldı");
					 break;
				 }
				 default:{
					 System.out.println("lütfen 0 ile 4 arasında bir secim yapınız");
				 }
				
			 }
		}
	}
	
	public static int topla(int sayi1,int sayi2){
		int sonuc=sayi1+sayi2;
		return sonuc;
	}
	public static int cikar(int sayi1,int sayi2){
		int sonuc=sayi1-sayi2;
		return sonuc;
	}
	public static int carp(int sayi1,int sayi2){
		int sonuc=sayi1*sayi2;
		return sonuc;
	}
	public static int bol(int sayi1,int sayi2){
		int sonuc=sayi1/sayi2;
		return sonuc;
	}
}