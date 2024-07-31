package com.ahmete.week04.day02;

import java.util.*;

public class OzelListe {
	
	/*
	1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
	 */
	private int[] sayiDizisi;
	private int boyut;
	
	public int[] getSayiDizisi() {
		return sayiDizisi;
	}
	/*
	1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
	int türünde sayiyi alacak ve sayi dizimize ekleyecek.
	 */
	
	public void add(int sayi) {
		int[] tmp;
		if (sayiDizisi == null) {
			sayiDizisi = new int[1];
			sayiDizisi[0] = sayi;
			this.boyut = 1;
		}
		else {
			tmp = new int[this.boyut + 1];//sayi dizimizin önceki size'ının bir fazlası olacak cunku yeni "bir" eleman
			// ekliyoruz
			for (int i = 0; i < boyut; i++) {
				tmp[i] = sayiDizisi[i];
			}
			tmp[this.boyut] = sayi;
			sayiDizisi = tmp;
			boyut++;
		}
	}
	
	/*
	1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak
	verdiği index'i silecek.
	 */
	public void remove(int index) {
		int[] tmp = new int[this.boyut - 1];
		for (int i = 0; i < this.boyut - 1; i++) {
			if (i < index) {
				tmp[i] = sayiDizisi[i];
			}
			else {
				tmp[i] = sayiDizisi[i + 1];
			}
		}
		sayiDizisi = tmp;
		boyut--;
	}
	
	/*
	1.3 - list isimli bir metot daha yazalım. Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül
	problemini de çözelim.
	 */
	public void list() {
		System.out.print("{");
		for (int i = 0; i < boyut; i++) {
			System.out.print(sayiDizisi[i]);
			if (i != boyut - 1) {
				System.out.print(",");
			}
			
		}
		System.out.println("}");
	}
	
	/*
	1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize
	eklesin.
	 */
	public void addAll(int[] sayiDizisi) {
		for (int i = 0; i < sayiDizisi.length; i++) {
			add(sayiDizisi[i]);
			
		}
	}
	
	public void removeAllIndexes(int[] indexesToBeRemoved) {
		Arrays.sort(indexesToBeRemoved);
		for (int i = indexesToBeRemoved.length - 1; i >= 0; i--) {
			remove(indexesToBeRemoved[i]);
		}
	}
}