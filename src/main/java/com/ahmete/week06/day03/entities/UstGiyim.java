package com.ahmete.week06.day03.entities;

import com.ahmete.week06.day03.utility.EColor;
import com.ahmete.week06.day03.utility.ESize;

public class UstGiyim extends Kiyafet{
	public UstGiyim(Double fiyat, Integer stokAdet, String urunAdi, ESize size, EColor color) {
		super(fiyat, stokAdet, urunAdi,size,color);
	}
}