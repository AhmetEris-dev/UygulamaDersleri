package com.ahmete.week06.day03.databases;

import com.ahmete.week06.day03.entities.Mail;
import com.ahmete.week06.day03.entities.User;
import com.ahmete.week06.day03.utility.DBManager;

import java.util.ArrayList;
import java.util.List;

public class MailDB extends DBManager<Mail> {
	
	public List<Mail> findRecievedMailsByUser(User user) {
		List<Mail> mailList = new ArrayList<>();
		for (Mail mail : arrayList) {
			if (user.equals(mail.getReceiver())) {
				mailList.add(mail);
			}
		}
		return mailList;
	}
	
	public List<Mail> findSentMailsByUser(User user) {
		List<Mail> mailList = new ArrayList<>();
		for (Mail mail : arrayList) {
			if (user.equals(mail.getSender())) {
				mailList.add(mail);
			}
		}
		if (mailList.size() != 0) {
			return mailList;
		}
		else return mailList;
	}
}