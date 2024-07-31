package com.ahmete.week04.kks.original;

import java.util.Arrays;

public class MailOzelListe {
	/*
	1- OzelListe isimli bir sinif olusturalim. Bu sinif icerisinde sayi dizisi ve dizi boyutu tutsun.
	 */
	private Mail[] mailDizisi;
	private int boyut;
	MailOzelListe(){
		mailDizisi=new Mail[0]; //constructor da verdik cağrıldıgı zaman otomatik olarak dizi 0 indexinden
		// başlıycak
	}
	
	public Mail[] getMailDizisi() {
		return mailDizisi;
		
	}
	/*
	1.1 - OzelListe sınıfında add isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği
	int türünde sayiyi alacak ve sayi dizimize ekleyecek.
	 */
	
	public Mail add(Mail mail) {
		Mail[] tmp;
		tmp = new Mail[this.boyut+1];
		for (int i = 0; i<boyut; i++){
			tmp[i] = mailDizisi[i];
		}
		tmp[this.boyut] = mail;
		mailDizisi = tmp;
		this.boyut++;
		return mailDizisi[boyut-1];
	}
	
	/*
	1.2 - OzelListe sınıfında remove isimli bir metot yazalim. Bu metot kullanıcının dışarıdan parametre olarak verdiği index'i silecek.
	 */
	public void remove(int index){
		
		if ((this.boyut-1)<index){
			try {
				throw new ArrayIndexOutOfBoundsException("");
			} catch (ArrayIndexOutOfBoundsException e ){
				System.out.println("Mailde "  + index +". eleman bulunmamakta.");
			}
		}else {
			try {
				Mail[] tmp = new Mail[this.boyut - 1];
//            int j = 0;
				for (int i = 0; i < tmp.length; i++) {
					if (i < index) {
						tmp[i] = mailDizisi[i];
					} else {
						tmp[i] = mailDizisi[i + 1];
					}
				}
				mailDizisi = tmp;
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
			System.out.print(mailDizisi[i]);
			if (i != boyut-1){
				System.out.print(",");
			}
			
		}
		System.out.println("}");
	}
	/*
	1.4 - addAll isimli bir metot yazalım. Dışarıdan dizi alsın, aldığı dizinin elemanlarının hepsini sayı dizimize eklesin.
	 */
	public Mail[] addAll(Mail[] mailDizisi){
		for (int i = 0; i<mailDizisi.length;i++){
			add(mailDizisi[i]);
		}
		return mailDizisi;
	}
	public void removeAllIndexes(int[] indexesToBeRemoved){
		Arrays.sort(indexesToBeRemoved);
		for (int i = indexesToBeRemoved.length-1; i>=0;i--){
			remove(indexesToBeRemoved[i]);
		}
	}
	public Mail replace(int index, Mail mail) {
		return mailDizisi[index] = mail;
	}
}