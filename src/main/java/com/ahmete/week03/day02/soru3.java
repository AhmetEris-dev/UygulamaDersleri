package com.ahmete.week03.day02;
/*
3- Dizideki en buyuk 2. sayiyi bulalim.
-> 120, 130, 125, -256, 16, 1300, 1258, 81, 14
 */

public class soru3 {
	public static void main(String[] args) {
		int[] sayilar={120, 130, 125, -256, 16, 1300, 1258, 81, 14};
		int max=Integer.MIN_VALUE;
		int ikinciMax= Integer.MIN_VALUE;
		for (int i = 0; i <sayilar.length ; i++) {
			if (sayilar[i]>max){
				max=sayilar[i];
			}
			
			
		}
		for(int i = 0; i<sayilar.length;i++){
			if(sayilar[i] < max && sayilar[i] > ikinciMax){
				ikinciMax = sayilar[i];
			}
		}
		System.out.println(ikinciMax);
		
		
	
	}
}