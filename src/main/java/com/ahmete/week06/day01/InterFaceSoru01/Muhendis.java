package com.ahmete.week06.day01.InterFaceSoru01;

public class Muhendis extends Calisan implements SahaCalismasiYapabilir,MaasaGoreUnvanAlabilir{
	
	public Muhendis(String ad, double maas, String soyAd) {
		this.setAd(ad);
		this.setSoyAd(soyAd);
		this.setMaas(maas);
		setUnvan(maas);
	}
	
	@Override
	public void sahaCalismasiYap() {
		System.out.println("muhendis saha calısması yurutuyor");
	}
	
	@Override
	public void setUnvan(double maas) {
		
		if (maas >=50000){
			this.setUnvan("uzman muhendis");
		}
		else if (maas >=40000) {
			this.setUnvan("kıdemli muhendis");
		}
		else if (maas >=30000) {
			this.setUnvan("muhendis");
		}else {
			this.setUnvan("stajyer muhendis");
		}
	}

//	@Override
//	public void setUnvan(String unvan) {
//		double maas = this.getMaas();
//		if (maas >=50000){
//			this.setUnvan("uzman muhendis");
//		}
//		else if (maas >=40000) {
//			this.setUnvan("kıdemli muhendis");
//		}
//		else if (maas >=30000) {
//			this.setUnvan("muhendis");
//		}else {
//			this.setUnvan("stajyer muhendis");
//		}
//	}
	
	
	@Override
	public void setMaas(double maas) {
		super.setMaas(maas);
		setUnvan(maas);
	}
	@Override
	public String toString() {
		return this.getClass().getSuperclass().getSimpleName()+"{"+"Muhendis{" +
				super.toStringTemplate()+
				'}'+"}";
	}
}