package com.ahmete.week06.day01.InterFaceSoru01;

public class Calisan extends CalisanDB {
	protected String ad;
	private String soyAd;
	private String unvan;
	private double maas;
	
	
	// init blogu
	{
		CalisanDB.calisanListesi.add(this);
	}
	
	public  void maasAl(){
		System.out.println("maaş alındı");
	}
	
	public  void izinAl(){
		System.out.println("izin alındı");
	}
	
	public void fazlaMesaiYap(){
		System.out.println("fala mesai yapıldı");
	}
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public double getMaas() {
		return maas;
	}
	
	public void setMaas(double maas) {
		this.maas = maas;
	}
	
	public String getSoyAd() {
		return soyAd;
	}
	
	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}
	
	public String getUnvan() {
		return unvan;
	}
	
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
	@Override
	public String toString() {
		return "Calisan{" +
				"isim='" + ad + '\'' +
				", soyisim='" + soyAd + '\'' +
				", unvan='" + unvan + '\'' +
				", maas=" + maas +
				'}';
	}
	
	public String toStringTemplate(){
		return  "isim='" + ad + '\'' +
				", soyisim='" + soyAd + '\'' +
				", unvan='" + unvan + '\'' +
				", maas=" + maas;
	}
	
}