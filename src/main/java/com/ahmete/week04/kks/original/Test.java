package com.ahmete.week04.kks.original;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Mail mail=new Mail();
		Kullanici kullanici1=new Kullanici();
		Kullanici kullanici2=new Kullanici();
		
		mail.setBaslik("deneme");
		mail.setIcerik("deneme içeriği");
		mail.setGonderici(kullanici1);
		mail.setAlici(kullanici2);
		MailDB.save(mail);
		MailDB.save(mail);
		MailDB.findAll();
		
		MailDB.saveAll(new Mail[]{mail,mail});
		MailDB.findAll();
		
		mail.setBaslik("Deneme");
		mail.setIcerik("Deneme icerigi");
		mail.setGonderici(kullanici1);
		mail.setAlici(kullanici2);
		SMS sms = new SMS();
		System.out.println(MailDB.save(mail));
		
		ArrayList<Message> arrayList=new ArrayList();
		arrayList.add(mail);
		arrayList.add(sms);
		
		arrayList.forEach(System.out::println);
		
		
	}
}