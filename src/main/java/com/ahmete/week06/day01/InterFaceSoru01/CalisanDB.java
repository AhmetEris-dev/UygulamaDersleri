package com.ahmete.week06.day01.InterFaceSoru01;

import java.util.ArrayList;
import java.util.List;

public class CalisanDB {
	
	  static List<Calisan> calisanListesi=new ArrayList<>();
	  
	  public List<Calisan> findALL(){
		  return calisanListesi;
	  }
	  
	  
	  public List<MaasaGoreUnvanAlabilir>  findAllByDeterminedByMaas(){
		  List<MaasaGoreUnvanAlabilir> maasaGoreUnvanAlanlar = new ArrayList<>();
		  for (Calisan calisan:calisanListesi){
			  if (calisan instanceof  MaasaGoreUnvanAlabilir){
				  maasaGoreUnvanAlanlar.add((MaasaGoreUnvanAlabilir) calisan);
			  }
		  }
		  return maasaGoreUnvanAlanlar;
	  }
	  
	  public List<SahaCalismasiYapabilir> findallThatSahaCalismasiYapabilir(){
		  List<SahaCalismasiYapabilir> sahaCalismasiYapabilirList= new ArrayList<>();
		  for (Calisan calisan:calisanListesi){
			  if (calisan instanceof  SahaCalismasiYapabilir){
				  sahaCalismasiYapabilirList.add((SahaCalismasiYapabilir) calisan);
			  }
		  }
		  return sahaCalismasiYapabilirList;
	  }
	  
	  public List<NonSPecificEmployees> findAllNonSpesificCalisans(){
		  List<NonSPecificEmployees>  nonSPecificEmployeesList=new ArrayList<>();
		  for (Calisan calisan:calisanListesi){
//			  if (!(calisan instanceof  MaasaGoreUnvanAlabilir)&&!(calisan instanceof  SahaCalismasiYapabilir)){
//				  filterCalisanList.add(calisan);
//			  }
			  if (calisan instanceof NonSPecificEmployees){
				  nonSPecificEmployeesList.add((NonSPecificEmployees) calisan);
				  
			  }
		  }
		  return nonSPecificEmployeesList;
	  }
	
}