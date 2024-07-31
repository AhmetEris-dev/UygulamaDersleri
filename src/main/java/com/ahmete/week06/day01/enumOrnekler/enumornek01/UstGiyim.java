package com.ahmete.week06.day01.enumOrnekler.enumornek01;

import com.ahmete.week06.day03.utility.EColor;
import com.ahmete.week06.day03.utility.ESize;

public class UstGiyim {
	private EUstGiyim type;
	
	public UstGiyim(EUstGiyim type) {
		this.type = type;
	}
	
	public UstGiyim(double price, int stockAmount, String name, ESize size, EColor color) {
	
	
	}
	
	public EUstGiyim getType() {
		return type;
	}
	
	public void setType(EUstGiyim type) {
		this.type = type;
	}
}