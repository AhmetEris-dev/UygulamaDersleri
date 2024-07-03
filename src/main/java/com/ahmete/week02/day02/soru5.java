package com.ahmete.week02.day02;

public class soru5 {
	/*
	1'den 100'e kadar olan çift sayıların toplamının,
     tek sayıların toplamına olan oranını bulan program.
	 */
	public static void main(String[] args) {
		int evenSum = 0; //cift toplam
		int oddSum = 0;  // tek toplam
		double ratio;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		ratio = ((double) evenSum) / oddSum;
		System.out.println("cift sayilerin tek yasilara oranı: " + ratio);
	}
}