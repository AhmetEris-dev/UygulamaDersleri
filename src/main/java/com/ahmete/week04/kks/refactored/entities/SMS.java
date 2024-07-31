package com.ahmete.week04.kks.refactored.entities;

import java.time.LocalDate;

public class SMS extends Message {
	private static int smsCount=0;
	
	public SMS(){
		this.smsCount++;
		this.id = smsCount;
		this.gonderilmeTarihi = LocalDate.now();
	}
	
	
	@Override
	public String toString() {
		return "SMS{" + "alici=" + getAlici() + ", gonderici=" + getGonderici() + ", gonderilmeTarihi=" + getGonderilmeTarihi() + ", icerik='" + getIcerik() + '\'' + ", id=" + getId() + '}';
	}
}