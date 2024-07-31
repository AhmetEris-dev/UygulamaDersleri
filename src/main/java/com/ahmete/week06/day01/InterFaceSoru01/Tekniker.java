package com.ahmete.week06.day01.InterFaceSoru01;

public class Tekniker extends Calisan implements SahaCalismasiYapabilir{
	
	public Tekniker() {
		this.setUnvan("Tekniker");
	}
	
	@Override
	public void sahaCalismasiYap() {
		System.out.println(this.getClass().getSimpleName()+" saha calısması yurutuyor.");
	}
}