package com.ahmete.week06.day03.entities;

import java.util.ArrayList;
import java.util.List;

public class Sepet{
	static int sepetIDCountter=0;
	
	
	private Double toplamFiyat;
	private int sepetID;
	
	List<UrunSepetDetay> sepetDetayList;
	User user;
	
	public Sepet() {
		this.sepetID=sepetIDCountter++;
	}
	
}