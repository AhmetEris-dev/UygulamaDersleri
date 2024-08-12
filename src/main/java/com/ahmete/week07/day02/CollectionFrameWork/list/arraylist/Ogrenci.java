package com.ahmete.week07.day02.CollectionFrameWork.list.arraylist;

public class Ogrenci {
	private String ad;
	private String soyad;
	
	public Ogrenci(String ad, String soyad) {
		this.ad = ad;
		this.soyad = soyad;
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public String getSoyad() {
		return soyad;
	}
	
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
	@Override
	public String toString() {
		return "Ogrenci{" + "ad='" + getAd() + '\'' + ", soyad='" + getSoyad() + '\'' + '}';
	}
}