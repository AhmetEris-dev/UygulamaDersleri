package com.ahmete.week02.day04;
/*
string sınıfı metotlarına bakıcaz
 */
public class stringDegiskenleri {
	public static void main(String[] args) {
		String value=" merhaba dunya ";
		String value2="merhaba dunya";
		
		System.out.println(value.charAt(2)); //2. indexteki karakteri gösterir.index 0,1,2,... diye gider.
		
		System.out.println(value.trim()); // whitespace leri siler.
		
		System.out.println(value.charAt(2));
		
		System.out.println(value2.length());
		
		System.out.println(value2.indexOf('a')); // a harfinin ilk gorundugu indeksi verir
		
		System.out.println(value.lastIndexOf('a')); //a harfinin göründüğü son indeksi verir
		
		System.out.println(value2.substring(5)); // 5. imdex ve sonrasını getirir
		
		System.out.println(value2.substring(0,5)); // 0. indexten 5. index e kadar olan kısım getirir.
		
		System.out.println(value.equals(value2));
		
		System.out.println(value == " merhaba dunya ");
		// value degiskeninin degeri ile ham (raw) " merhaba dunya "
		// degerini karsılastırıyor farklı bir string degiskeni icerisinde olmayan " merhaba dunya " text'i heap'te
		// herhangi bir nesneye karsılık gelmiyor dolayısıyla value degiskeninin degerini aldıgı adres aslında "
		// merhaba dunya " yazısısnın ta kendisi o yuzden true doner.
		
		
		System.out.println(value.trim()==value2); // referans degerine bakarak okur bu iki degiskenin degeri bellekte
		// aynı adreste saklanmıyor
		
		System.out.println(value.trim().equals(value2));
		// .equals ile ic, ham (raw) deger karsılastırmasına sokuyorum.o yuzden true doner.
		
		value=value.trim();
		System.out.println(value == value2);
		
		
		
		
	
	}
}