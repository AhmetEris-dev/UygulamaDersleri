package com.ahmete.week06.day01.enumOrnekler.enumornek01;

public enum EUstGiyim {
	TSHIRT("KIRMIZI"),
	KAZAK("LACIVERT"),
	TRIKO("BEYAZ");
	
	private String renk;
	
	EUstGiyim(String renk) {
		this.renk = renk;
	}
}