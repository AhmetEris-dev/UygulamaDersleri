package com.ahmete.week04.day02;

public class OzelListeTest {
	public static void main(String[] args) {
		OzelListe ozelListe=new OzelListe();
		ozelListe.add(15);
		ozelListe.add(20);
		ozelListe.add(25);
		ozelListe.add(30);
		ozelListe.add(35);
		for (int sayi: ozelListe.getSayiDizisi()){
			System.out.println(sayi);
			
		}
		System.out.println("----------------");
		ozelListe.remove(2);
		for (int sayi: ozelListe.getSayiDizisi()){
			System.out.println(sayi);
			
		}
		System.out.println("--------------");
		ozelListe.list();
		
		
		System.out.println("-----------------");
		int[] numArr={3,5,7,9};
		ozelListe.adAll(numArr);
		ozelListe.list();
	}
}