package com.ahmete.week02.day01;

public class soru1 {
	/*
	 * Bir ürünün fiyatında %18 kdv ve %15 kar oldugunu biliyoruz. bir urun fiyati olsun bu urun fiyatından ham
	 * fiyatını bulalaım
	 */
	public static void main(String[] args) {
		float rawPrice = 0, price = 100, priceWithoutVat, vatRatio = 0.18f, profitRatio = 0.15f;
		priceWithoutVat = price - (price * vatRatio);
		
		System.out.println("KDV'siz fiyat: " + priceWithoutVat);
		rawPrice = priceWithoutVat - (priceWithoutVat * profitRatio);
		System.out.println("ham fiyat: " + rawPrice);
		
		
	}
}