package com.ahmete.week03.day02;

public class _00_ArrayTekrar {
	public static void main(String[] args) {
		//aynı turde coklu veri saklar
		//boyutu sabittir bir kere boyutlandırıldımı birdaha yeniden boyutlandırma dogrudan yapılamaz.
		
		String [] stringArray=new String[4];
		System.out.println(stringArray.length);
		String []stringArray2= {"kelime1","kelime2"};
		
		boolean[] booleanArray= new boolean[3];
		System.out.println(booleanArray[0]); //boolean lar default ta false deger alır
		System.out.println(stringArray[0]); // stringler defaultta null degerini alır
		String str=stringArray[0];
		
		 // boolean bool =str.equals("alperen");// Null pointer excaption
	}
}