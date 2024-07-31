package com.ahmete.week04.kks.original;

import java.util.Arrays;

public class KullaniciOzelListe {
	
	/*
	1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
	 */
	private Kullanici[] kullaniciDizisi;
	private int boyut;
	KullaniciOzelListe(){
		kullaniciDizisi=new Kullanici[0]; //constructor da verdik cağrıldıgı zaman otomatik olarak dizi 0 indexinden
		// başlıycak
	}
	
	public Kullanici[] getKullaniciDizisi() {
		return kullaniciDizisi;
		
	}
	/*
	1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
	int türünde sayiyi alacak ve sayi dizimize ekleyecek.
	 */
	
	public Kullanici add(Kullanici kullanici) {
		Kullanici[] tmp;
			tmp = new Kullanici[this.boyut+1];
			for (int i = 0; i<boyut; i++){
				tmp[i] = kullaniciDizisi[i];
			}
			tmp[this.boyut] = kullanici;
			kullaniciDizisi = tmp;
			this.boyut++;
		return kullaniciDizisi[boyut-1];
	}
	
	/*
	1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
	 */
	public void remove(int index){
		
		if ((this.boyut-1)<index){
			try {
				throw new ArrayIndexOutOfBoundsException("");
			} catch (ArrayIndexOutOfBoundsException e ){
				System.out.println("Dizide "  + index +". eleman bulunmamakta.");
			}
		}else {
			try {
				Kullanici[] tmp = new Kullanici[this.boyut - 1];
//            int j = 0;
				for (int i = 0; i < tmp.length; i++) {
					if (i < index) {
						tmp[i] = kullaniciDizisi[i];
					} else {
						tmp[i] = kullaniciDizisi[i + 1];
					}
				}
				kullaniciDizisi = tmp;
				boyut--;
			} catch (NegativeArraySizeException e) {
				System.out.println("Dizide cikarilabilecek eleman bulunmamaktadir. ( Dizi BOS!! ) ");
			}
		}
		
	}
	
	/*
	1.3 - list isimli bir metot daha yazalım. Bu metot listemizi { , , , , } formatında yazdırsın. Son eleman virgül problemini de çözelim.
	 */
	public void list(){
		System.out.print("{");
		for (int i = 0; i <boyut ; i++) {
			System.out.print(kullaniciDizisi[i]);
			if (i != boyut-1){
				System.out.print(",");
			}
			
		}
		System.out.println("}");
	}
	/*
	1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize eklesin.
	 */
	public  void adAll(Kullanici[] kullanicilar){
		for (int i = 0; i <kullanicilar.length ; i++) {
			add(kullanicilar[i]);
		}
	}
	public void removeAllIndexes(int[] indexesToBeRemoved){
		Arrays.sort(indexesToBeRemoved);
		for (int i = indexesToBeRemoved.length-1; i>=0;i--){
			remove(indexesToBeRemoved[i]);
		}
	}
	public Kullanici replace(int index, Kullanici kullanici) {
		return kullaniciDizisi[index] = kullanici;
	}
}