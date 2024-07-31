package com.ahmete.week04.kks.refactored.databases;

import com.ahmete.week04.kks.refactored.entities.Kullanici;
import com.ahmete.week04.kks.refactored.entities.Mail;
import com.ahmete.week04.kks.refactored.utility.DataBaseManager;

import java.util.ArrayList;
import java.util.List;

public class MailDB extends DataBaseManager<Mail> {
	
	public List<Mail> findReceivedByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici = new ArrayList<>();
		for (Mail mail: veriListesi){
			if(mail.getAlici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
	
	public List<Mail> findSentByKullanici(Kullanici kullanici) {
		List<Mail> mailsByKullanici = new ArrayList<>();
		for (Mail mail: veriListesi){
			if(mail.getGonderici().equals(kullanici)){
				mailsByKullanici.add(mail);
			}
		}
		return mailsByKullanici;
	}
}