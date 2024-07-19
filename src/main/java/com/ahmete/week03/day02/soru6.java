package com.ahmete.week03.day02;
/*
 6- Dizi içerisinde 1 ve 4 sayilarinin kac kere geçtiğini ve 1 sayısının adeti
    4 sayısının adetinden büyükse true değilse false yazdıralım.
    -> 1,4,5,6,1,1,4,8
 */

public class soru6 {
	public static void main(String[] args) {
		int[] sayilar = {1,4,5,6,1,1,4,8};
		boolean birdenFazlaMi;
		int birAdet = 0;
		int dortAdet = 0;
		
		for (int i = 0; i< sayilar.length;i++){
			if(sayilar[i] == 1){
				birAdet++;
			} else if (sayilar[i] == 4){
				dortAdet++;
			}
		}
		birdenFazlaMi = birAdet>dortAdet;
		System.out.println(birdenFazlaMi);
		
	}
}