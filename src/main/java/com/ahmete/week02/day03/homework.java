package com.ahmete.week02.day03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class homework {
	/*
	Bir program oluşturacağız. Kullanıcıyı önce konsolda karşılayıp, sonrasında kullanıcıya hangi dilde devam etmek istersiniz diye soracağız.

Karşılama menüsü aşağıdaki gibidir;
Hoşgeldiniz! / Welcome!
Lutfen goruntuleme dilini seciniz. / Please select display language.

1-- Turkish (TR)
2-- English (EN)

Kullanıcının vereceği cevaba göre bizi 2 farlı menü karşılayabilecek.

Menü'nün Türkçe versiyonundaki işlevler aşağıdaki gibidir;
0 -- Çıkış Yap
1--  Merhaba Dünya yazdır.
2-- Faktoriyel Hesapla.
3-- Asal sayı kontrolü yap.

Kullanıcı çıkış yapmadığı sürece menü'de kalacak ve menü işlevlerini kullanmaya devam edebilecek. Çıkış yapmaya karar vermesi durumunda;

Program sonlandırılmıştır! Gorusmek uzere! gibi bir çıktı verip bitirebilirsiniz.
Çalışmam
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hoşgeldiniz!/Welcome!");
		System.out.println("Lütfen görüntüleme dilini seciniz/Please select display language.");
		System.out.println("1-- Turkish (TR) "+" 2-- English (EN)");
		int dilSecenegi;
		dilSecenegi=scanner.nextInt();
		
		while (dilSecenegi!=0){
		
		
		if(dilSecenegi==1){
			System.out.println("yaptırmak istediğiniz islemin sayisini giriniz\n"+"0--Cıkıs yap\n"+"1--Merhaba dünya " +
					"yazdir\n"+"2--Faktoriyel hesapla\n"+"3--Asal sayi " +
					                   "kontrolu yap");
			int sayi ;
			sayi=scanner.nextInt();
			switch (sayi){
				case 0:
					System.out.println("Program sonlandırılmış! Gorusmek uzere!");
					break;
				case 1:
					System.out.println("Merhaba dunya");
					break;
				case 2:
					System.out.println("sayi giriniz");
					int sayi1,sayac,carpma;
					sayi1=scanner.nextInt();
					sayac=1;
					carpma=1;
					while (sayac<sayi1){
						sayac=sayac+1;
						carpma=carpma*sayac;
						
					}
					System.out.println("sonuc: "+carpma);
					break;
				case 3:
					System.out.println("bir sayi giriniz");
					int sayi2,sayac2,i;
					sayi2= scanner.nextInt();
					sayac2=0;
					for (i=1;i<=sayi2;i++){
						if (sayi2%i==0){
							sayac2=sayac2+1;
						}
					}
					if (sayac2>2){
						System.out.println("sayi asal değildir");
					}else{
						System.out.println("sayi asaldir");
						break;
						
					} default:
					System.out.println("lutfen 0 ile 3 arasında bir sayi giriniz");
			}
			
		}else{
			System.out.println("enter the number of operations you want to perform\n"+"0--Log out\n"+"1--Print hello " +
					                   "world\n"+"2--calculate factorial\n"+"3--check prime " +
					                   "number");
			int number;
			number=scanner.nextInt();
			switch (number){
				case 0:
					System.out.println("Programme terminated! Goodbye!");
					break;
				case 1:
					System.out.println("Hello world");
				case 2:
					System.out.println("enter  number");
					int number1,count,impact;
					number1=scanner.nextInt();
					count=1;
					impact=1;
					while (count<number1){
						count=count+1;
						impact=impact*count;
					}
					System.out.println("sonuc: "+impact);
					break;
				case 3:
					System.out.println("enter number");
					int number2,count2,i;
					number2=scanner.nextInt();
					count2=0;
					for (i=1;i<=number2;i++){
						if (number2%i==0){
							count2=count2+1;
						}
					}
					if (count2>2){
						System.out.println("number is not prime");
					}else{
						System.out.println("prime number");
						break;
					} default:
					System.out.println("please enter a number between 0 and 3");
			}
		}
		
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}