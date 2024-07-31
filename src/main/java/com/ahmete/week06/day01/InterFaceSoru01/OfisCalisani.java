package com.ahmete.week06.day01.InterFaceSoru01;

public class OfisCalisani extends Calisan implements MaasaGoreUnvanAlabilir{
	
	public OfisCalisani(String ad,String soyAd, double maas) {
		this.setAd(ad);
		this.setSoyAd(soyAd);
		this.setUnvan(maas);
		setUnvan(maas);
	}
	
	@Override
	public void setUnvan(double maas) {
		if (maas >= 30000){
			this.setUnvan("kidemli calısan");
		}
		else if (maas>= 20000) {
			this.setUnvan("calısan");
		}else {
			this.setUnvan("stajyer ofis calısanı");
		}
	}
	
	@Override
	public void setMaas(double maas) {
		super.setMaas(maas);
		setUnvan(maas);
	}
}