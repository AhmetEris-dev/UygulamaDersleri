package com.ahmete.week03.day03;
/*
1-geriye deger donduren
2-geriye deger dondurmeyen
3-parametre alan.
 3.1- birden fazla parametre alan
 3.2- tek parametre alan
4-parametre almayan

5-overloaded methods
methot içerisinde metot cagrılabilir.anca metot içerisinde metot tanımlanamaz.
metotlar class scope'unda tanımlanır
 */

public class metodTekrar {
	public static void main(String[] args) {
		System.out.println();
		int mahmut=3;
		String name ="ahmet";
		int age=27;
		
		
		geriDonussuzParametreliMetot(name,age);
	
	
	}
	// parametresiz metot
	public static void nonParametreMetot(){
		System.out.println("parametre almayan metot");
	}
	
	//parametresiz, ama geri donus tipi olan metot
	 public static String nonParametresiOlmayanGeriDonusTipiOlanMetot(){
		return "hello world";
	 }
	 
	 //parametreli geri donuslu
	
	public static String parametreliDonusTipiOlmayan(int number){
		number+=1;
		return "merhaba "+number;
		
	}
	//parametreli geri donus tipsiz
	
	public static void geriDonussuzParametreliMetot(String name,int age){
		System.out.println(name+" yasi "+age);
	}
	
	
	
}