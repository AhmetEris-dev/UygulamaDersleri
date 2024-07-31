package com.ahmete.week04.kks.refactored.entities;

import java.time.LocalDate;

public class Message extends BaseEntitiy {
	
	protected Kullanici alici;
	protected Kullanici gonderici;
	protected String icerik;
	protected LocalDate gonderilmeTarihi;
	
	public Kullanici getAlici() {
		return alici;
	}
	
	public void setAlici(Kullanici alici) {
		this.alici = alici;
	}
	
	public Kullanici getGonderici() {
		return gonderici;
	}
	
	public void setGonderici(Kullanici gonderici) {
		this.gonderici = gonderici;
	}
	
	public String getIcerik() {
		return icerik;
	}
	
	public void setIcerik(String icerik) {
		this.icerik = icerik;
	}
	
	public LocalDate getGonderilmeTarihi() {
		return gonderilmeTarihi;
	}
	
	@Override
	public String toString() {
		return "Message{" +
				"alici=" + alici +
				", gonderici=" + gonderici +
				", icerik='" + icerik + '\'' +
				", gonderilmeTarihi=" + gonderilmeTarihi +
				", id=" + id +
				'}';
	}
	
}