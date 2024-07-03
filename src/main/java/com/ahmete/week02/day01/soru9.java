package com.ahmete.week02.day01;

public class soru9 {
	/*
	 den başlayarak gelen bütün sayıları toplayalım. Toplamımız 50'yi geçene kadar çalışsın.
     En son toplamı yazdıralım ve bu döngünün kaç kere çalıştığını yazdıralım.
	 */
	public static void main(String[] args) {
		int i=1;
		int toplam=0;
		int limit=50;
		//        for (toplam = 0; toplam <= limit; i++){
//            total +=i;
//            System.out.println(total);
//            System.out.println(i);
//        } // ctrl + numpad "/";
		while (toplam <= limit) {
			toplam +=i;
//          if (toplam > limit){
//              break;
//          }
			i++;
		}
		System.out.println("Toplam : " + toplam + "\tDongu : " + (i-1));
	
	}
}