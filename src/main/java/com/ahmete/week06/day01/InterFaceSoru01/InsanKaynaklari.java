package com.ahmete.week06.day01.InterFaceSoru01;

public class InsanKaynaklari extends Calisan implements NonSPecificEmployees{
	
	
	
	public double zamYap(Calisan calisan,double zamOrani){
		double zamliMaas=0;
		if (zamOrani<=1 ){
			zamliMaas=calisan.getMaas()+calisan.getMaas()*zamOrani;
		}
		if (zamOrani>=1){
			zamliMaas=calisan.getMaas()*zamOrani;
		}
//		if (calisan.getClass().getSimpleName().equals(Muhendis.class.getSimpleName()));
	     if (calisan instanceof  Muhendis){
		     zamliMaas+=1000;
			 
			 
	    }
	     else if (calisan instanceof Tekniker) {
		     zamliMaas+=500;
	     }
		 calisan.setMaas(zamliMaas);
		 return zamliMaas;
	}
	
	public void unvanBelirle(){
	
	}
}