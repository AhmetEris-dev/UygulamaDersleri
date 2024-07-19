package com.ahmete.week03.day01;
/*
1- Dışarıdan bir kelime ve bir harf girilsin. Eğer kelimemizde o harf varsa kaç tane olduğunu ve index numaralarını yazdırın. Eğer harf içermiyorsa "aradığınız harf yok" gibi bir çıktı verin.
 */

import java.util.Scanner;

public class soru1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean menu=true;
		
		while (menu){
			System.out.println("menu");
			System.out.println("\n1-- lütfen bir kelime ve sayısını bulmak istediğiniz harfi giriniz ");
			System.out.println("2-- bir kelime giriniz. Daha sonra değiştirmek istediğiniz harfi giriniz ve hangi " +
					                   "harfle değiştireceğinizi belirtin. ");
			System.out.println("3-- ters cevirip yazmak istediğiniz kelimeyi giriniz");
			System.out.println("4-- Dışarıdan 5 adet kelime girelim. Her kelimenin a, b veya c ile başlayıp başlamadığını kontrol edelim. Ayrı ayrı sayfa açıldığını düşünelim; a ile başlayanlar bir sayfaya, b ile başlayanlar bir sayfaya, c ile başlayanlar bir sayfaya yazılsın. Diğer harflerle başlayanlar için ayrı bir sayfa düşünelim. Sonrasında girilen 5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa olduğunu ekrana yazdıralım.");
			System.out.println("0-- cıkıs");
			System.out.println("lütfen yapmak istediğiniz işlemin sayisini giriniz:");
			int secim =scanner.nextInt();
			scanner.nextLine();
			switch (secim){
				case 1:{
					System.out.println("lütfen bir kelime  giriniz");
					String kelime=scanner.nextLine();
					System.out.println("lütfen kontrol etmek istediğiniz harfi giriniz");
					char harf=scanner.nextLine().charAt(0);
					int sayac=0;
					if (!kelime.contains(String.valueOf(harf))){
						System.out.println("\n kelimenin içinde istedğiniz harf bulunmamaktadır");
						break;
					}
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i)==harf){
							sayac++;
							
						}
						
					}
					System.out.println("girdiginiz " + kelime + " kelimesinde " + sayac + " adet " + harf +
							                   " harfi bulunmaktadır.");
					break;
					
					
					
				}
				case 2:{
					System.out.println("lütfen bir kelime  giriniz");
					String kelime=scanner.nextLine();
					System.out.println("lütfen değiştirmek  istediğiniz harfi giriniz");
					char harf=scanner.nextLine().charAt(0);
					System.out.println("lütfen yerine değiştirmek istediğiniz harfi giriniz");
					char degistirilenHarf= scanner.nextLine().charAt(0);
					String yeniKelime=kelime.replace(harf,degistirilenHarf);
					System.out.println("eski kelime : "+ kelime+" yeni kelime : "+ yeniKelime);
					break;
					
					
					
				}
				case 3: {
					System.out.println("lütfen tersini almak istediğiniz kelimeyi giriniz");
					String kelime=scanner.nextLine();
					StringBuilder kelimeSb=new StringBuilder().append(kelime);
					kelimeSb.reverse();
					boolean polindromMu=true;
					if (String.valueOf(kelimeSb).equals(kelime)){
						polindromMu =true;
						System.out.println("polindromdur");
					
					}else {
						
						System.out.println("polindrom değildir");
					}
					
					
					break;
					
				}
				case 4 :{
					int a=0,b=0 , c=0 , d=0, toplam=0;
					System.out.println("lütfen 5 adet kelime giriniz");
					for (int i = 0; i <5 ; i++) {
						System.out.println("lütfen giriniz "+(i+1)+"kelimeyi: ");
						String kelime=scanner.nextLine();
						if (kelime.charAt(0)=='a'){
							a=1;
						}
						else if (kelime.charAt(0)=='b') {
							b=1;
							
						}
						else if (kelime.charAt(0)=='c') {
							c=1;
							
						}else {
							d += 1;
						}
						toplam=a+b+c+d;
						
					}
					System.out.println(toplam);
					break;
					
				}
				case 0:{
					menu=false;
					System.out.println("programdan cıkış yaptınız");
					break;
				}
				default:{
					System.out.println("lutfen gecerli bir secim yapıbız");
				}
			}
			
			
		}
		
	
	}
	
}