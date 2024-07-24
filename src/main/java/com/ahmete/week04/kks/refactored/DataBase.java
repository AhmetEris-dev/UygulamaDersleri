package com.ahmete.week04.kks.refactored;

public class DataBase<T extends Entity> {
	static OzelListe dataBaseDizisi = new OzelListe();
	
	static <T> T save(T t){
		return (T)dataBaseDizisi.add(t);
	}
	static<T> T[] saveAll(T[] t){
		return (T[]) dataBaseDizisi.addAll(t);
	}
	static<T extends Entity> T update(T t){
		T[] tdizisi = (T[]) dataBaseDizisi.getVeriDizisi();
		int index=0;
		for(T t1: tdizisi){
			if(t1.getId() == t1.getId()){
				return (T) dataBaseDizisi.replace(index, t);
			}
			index++;
		}
		return null;
	}
	
	static<T> T[] findAll(){
		T[] tDizisi = (T[]) dataBaseDizisi.getVeriDizisi();
		for(T t : tDizisi){
			System.out.println(t);
		}
		return tDizisi;
	}
	
	static<T extends Entity> T findById(int id){
		T[] tDizisi = (T[]) dataBaseDizisi.getVeriDizisi();
		for(T t1 : tDizisi){
			if (t1.getId()==id){
				return t1;
			}
		}
		return null;
	}
}