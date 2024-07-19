package com.ahmete.week03.day02;
/*


 */

public class soru2 {
	public static void main(String[] args) {
		int[] dizi={0,120,5,85,-256,16,1258,81,14};
		//max sayıyı bulmak için
		int max=dizi[0];
		for (int i = 0; i <dizi.length ; i++) {
			if (dizi[i]>max){
				max=dizi[i];
			}
			
		}
		System.out.println("en büyük sayi: "+max);
		
		int min=dizi[0];
		for (int i = 0; i <dizi.length ; i++) {
			if (dizi[i]<min){
				min=dizi[i];
			}
			
		}
		System.out.println("en kucuk sayi: "+min);
	}
}