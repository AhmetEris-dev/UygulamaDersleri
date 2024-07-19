package com.ahmete.week03.day04;

public class soru4 {
	/*
4- Dizideki elemanlar arasınndaki farkın en küçük olduğu değer nedir?
int[] array = { 1, 5, -4, 3 };
 */
//mutlak değer kullan
	
		public static void main(String[] args) {
			int[] array = { 1, 5, -4, 3 };
			System.out.println("en kucuk aralık: "+enKucukAralik(array));
		}
		public static int enKucukAralik(int[] arr){
			int minaralik=Integer.MAX_VALUE;
			int aralik;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j <arr.length ; j++) {
					aralik=Math.abs(arr[i]-arr[j]);
					if (aralik<minaralik){
						minaralik=aralik;
					}
				}
			}
			return minaralik;
			
		}
		
	
}