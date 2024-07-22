package com.ahmete.week03.day02;
/*
Dizideki bütün sayıların toplamını yazdıralım.
Dizinin her bir elemanı için;
çift ise çifttir, tek ise tektir yazdıralım.
-> 0, 120, 5, 85, -256, 16, 1258, 81, 14
 */

public class soru5 {
	public static void main(String[] args) {
		
		int[] array={0,120,5,85,-256,16,1258,81,14};
		int toplam=0;
		
		for (int i = 0; i <array.length ; i++) {
			toplam+=array[i];
			
			if (array[i]%2==0){
				System.out.println(array[i]+" cifttir");
			}else {
				System.out.println(array[i]+" tektir.");
			}
			
		}
		System.out.println("toplam: "+toplam);
	}
}