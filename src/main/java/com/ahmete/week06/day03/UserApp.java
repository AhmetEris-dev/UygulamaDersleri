package com.ahmete.week06.day03;

import com.ahmete.week06.day03.databases.MailDB;
import com.ahmete.week06.day03.databases.SepetDB;
import com.ahmete.week06.day03.databases.UserDB;
import com.ahmete.week06.day03.entities.Mail;
import com.ahmete.week06.day03.entities.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserApp {
	static Scanner sc = new Scanner(System.in);
	static UserDB userDB = new UserDB();
	static MailDB mailDB = new MailDB();
	
	// kullanıcı giriş/ kayıt menusu
	public static User userMenu() {
		int userInput = -1;
		System.out.println("\n---Welcome to the program---");
		do {
			System.out.println("\n---The Program---");
			System.out.println("1-sign up");
			System.out.println("2-sign in");
			System.out.println("3-Forgot my password");
			System.out.println("9-list all signed up users");
			System.out.println("0-Exit");
			System.out.print("Selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nPlease enter a numeric value!");
				continue;
			}
			finally {
				sc.nextLine();
			}
			switch (userInput) {
				case 1: {
					User user = userRegister();
					break;
				}
				case 2: {
					User user = userLogin();
					return user;
					
				}
				case 3:{
					changeForgottenPassword();
					break;
				}
				case 8: {
					generateData();
					break;
				}
				case 9: {
					showUsers();
					break;
				}
				case 0 : {
					System.out.println("Please have nice day!");
					break;
				}
				default:
					System.out.println("Please enter a valid value!");
			}
		} while (userInput != 0);
		
		return null;
	}
	
	// > --- Case 1 : Start --- <
	private static User userRegister() {
		LocalDate birthDay;
		User user;
		birthDay = askBirthDate();
		if (!legalAgeCheck(birthDay)) {
			System.out.println("You are under the legal(+18) age! You cannot register!");
			return null;
		}
		user = new User();
		user.setBirthDay(birthDay);
		String[] fullName = askFullName();
		user.setName(fullName[0]);
		user.setSurname(fullName[1]);
		user.setMail(askMail());
		user.setPhoneNumber(askUserPhoneNumber());
		user.setTcNo(getUserTcNo());
		user.setUserName(askUserName());
		user.setPassword(askPassword());
		userDB.save(user);
		return user;
	}
	
	private static LocalDate askBirthDate() {
		while (true) {
			System.out.print("Please enter your birth day (yyyy-MM-dd): ");
			String date = sc.nextLine();
			try {
				LocalDate localDate = LocalDate.parse(date);
				return localDate;
			}
			catch (Exception e) {
				System.out.println("Please enter your birth day in right order as-> yyyy-MM-dd!! ");
			}
		}
	}
	private static boolean legalAgeCheck(LocalDate birthDay) {
		int age = Period.between(birthDay, LocalDate.now()).getYears();
		boolean isLegal = (age < 18) ? false : true;
		return isLegal;
	}
	
	private static String[] askFullName() {
		String[] fullName = new String[2];
		System.out.print("Please enter your name: ");
		fullName[0] = sc.nextLine();
		System.out.print("Please enter youe Surname: ");
		fullName[1] = sc.nextLine();
		return fullName;
	}
	
	private static String askMail() {
		while (true) {
			System.out.print("Please enter your e-mail address: ");
			String mail = sc.nextLine();
			if (!checkMail(mail)) { // @ yoksa aşağıdaki hatayı vericektir!
				System.out.println("Please enter a valid email address!");
				System.out.println("E-mail address must contain @ sign!");
				continue;
			}
			if (userDB.existByEmail(mail)) { // girilen email kayıtlı ise bu hatayı verecektir.
				System.out.println("Please try another mail address!");
				System.out.println("Someone has already signed up with this email address!");
				continue;
			}
			return mail;
			
		}
	}
	//TODO: @hotmail.com / @gmail.com için geliştirmeler yap.
	private static boolean checkMail(String mail) {
		if (!mail.contains("@")) {
			return false;
		}
		return true;
	}
	
	//TODO: kullanıcının sadece numarik ve sadece numara uzunluğunda değer girmesini sağla!
	private static String askUserPhoneNumber() {
		System.out.print("Please enter your mobile: +90 ");
		String phoneNum = sc.nextLine();
		return phoneNum;
	}
	
	private static String getUserTcNo() {
		String tcno;
		while (true) {
			System.out.print("Please enter your TC ID: ");
			tcno = sc.nextLine();
			if (!isTcNumeric(tcno)) {
				System.out.println("The ID number can only contain numeric characters.");
				continue;
			}
			if (tcno.length() != 11) {
				System.out.println("TC ID has 11 digits! Must entered 11 digits!");
				continue;
			}
			if (userDB.existByTc(tcno)) {
				System.out.println("Someone else already has that user ID. Please try another!");
				continue;
			}
			return tcno;
		}
	}
	private static boolean isTcNumeric(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!Character.isDigit(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String askUserName() {
		String username;
		while (true) {
			System.out.print("Please enter username: ");
			username = sc.nextLine();
			if (username.length() < 4) {
				System.out.println("Please enter longer username. min 4 characters!");
				continue;
			}
			else if (username.length() > 16) {
				System.out.println("Username is to long! max 16 characters!");
				continue;
			}
			if (userDB.existByUserName(username)) {
				System.out.println("This username already taken! Please try another!");
				continue;
			}
			return username;
		}
	}
	
	private static String askPassword() {
		String password;
		String reEnteredPass;
		while (true) {
			System.out.print("Please enter your password: ");
			password = sc.nextLine();
			if (password.length() < 8) {
				System.out.println("Please enter longer password. min 8 characters!");
				continue;
			}
			if (password.length() > 32) {
				System.out.println("Password is to long! max 32 characters!");
				continue;
			}
			System.out.print("Please re-enter your password: ");
			reEnteredPass = sc.nextLine();
			if (password.equals(reEnteredPass)) {
				return password;
			}
			System.out.println("Passwords does not match! Please try again!");
		}
	}
	// > --- Case 1 : End --- <
	
	// > --- Case 2 : Start --- <
	private static User userLogin() {
		System.out.print("Please enter your username: ");
		String username = sc.nextLine();
		System.out.print("Please enter your password: ");
		String password = sc.nextLine();
		User user = userDB.findByUsernameAndPassword(username, password);
		if (user == null){
			System.out.println("Username and password do not match! One of them is incorrect.");
			return null;
		}
		return user;
	}
	public static User userInterface(User user) {
		int userInput = -1;
		do {
			System.out.println("### USER INTERFACE ###");
			System.out.println("1.Show my information!");
			System.out.println("7.Change mobile");
			System.out.println("8.Change email");
			System.out.println("9.Change password");
			System.out.println("0-logout");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("\nPlease enter a valid value!");
			}
			finally {
				sc.nextLine();
			}
			
			switch (userInput) {
				case 1: { // profile
					showUserInfo(user.getId());
					break;
				}
				case 2: { // Mail user interface
					mailUserInterface(user);
					break;
				}
				case 7: { //mobile  değiş
					changeMobile(user);
					break;
				}
				case 8: { //email  değiş
					changeEmail(user);
					break;
				}
				case 9: { // şifre değiş
					if (changePassword(user)) {
						System.out.println("The new password has been set.");
						SepetDB.removeAllSepet();
						userInput = 0;
						return null;
					}
					
					break;
				}
				case 0: {
					System.out.println("Returning to home page...");
					SepetDB.removeAllSepet();
					return null;
				}
			}
			return null;
		}while (userInput != 0) ;
	}
	// > --- Login Case 1: Start --- <
	private static void showUserInfo(int id) {
		User user = userDB.findById(id);
		if (user != null){
			System.out.println(user);
		}else System.out.println("Could not find your information! Something went wrong!");
	}
	// > --- Login Case 1: End --- <
	
	// > --- Login Case 2: Start --- <
	private static void mailUserInterface(User user){
		int userInput = -1;
		do {
			System.out.println("### MAIL APP INTERFACE ###");
			System.out.println("1.Inbox");
			System.out.println("2.Outbox");
			System.out.println("3.Send a mail");
			System.out.println("0-return");
			System.out.print("selection: ");
			try {
				userInput = sc.nextInt();
			}
			catch (Exception e) {
				System.out.println("\nPlease enter a valid value!");
			}
			finally {
				sc.nextLine();
			}
			userInput = userMailAppFunctions(userInput, user);
		}while (userInput != 0);
	}
	private static int userMailAppFunctions(int userInput, User user) {
		switch (userInput) {
			case 1: { // inbox
				showInbox(user);
				break;
			}
			case 2: { // outbox
				showOutbox(user);
				break;
			}
			case 3: { //send a mail
				newMail(user);
				break;
			}
			case 0 : {
				System.out.println("Returning to home page...");
				break;
			}
		}
		return userInput;
	}
	// > --- Mail Case 1: Start --- <
	private static void showInbox(User user) {
		List<Mail> mailList =mailDB.findRecievedMailsByUser(user);
		if (mailList.size() != 0){
			listTheMails(mailList);
		}
		else System.out.println("\nInbox is empty!\n");
		
	}
	// > --- Mail Case 1: End --- <
	
	// > --- Mail Case 2: Start --- <
	private static void showOutbox(User user) {
		List<Mail> mailList =mailDB.findSentMailsByUser(user);
		if (mailList.size() != 0){
			listTheMails(mailList);
		}
		else System.out.println("\nOutbox is empty!\n");
	}
	// > --- Mail Case 2: End --- <
	
	private static void listTheMails(List<Mail> mailList){
		for (Mail mail : mailList){
			System.out.println("--------------------------------");
			System.out.println("Title: "+mail.getTitle());
			System.out.println("Content ");
			System.out.println(" "+ mail.getContent());
		}
		System.out.println("************** End of the list **************");
	}
	
	// > --- Mail Case 3: Start --- <
	private static void newMail(User senderUser) {
		while (true){
			System.out.print("Please enter a mail address to send: ");
			String receiverMail = sc.nextLine();
			if (receiverMail.equals(senderUser.getMail())){
				System.out.println("\nThis is your e-mail belongs to yours!");
				continue;
			}
			if (userDB.existByEmail(receiverMail)){
				User receiverUser =  userDB.findByEmail(receiverMail);
				System.out.print("Please enter a title: ");
				String title = sc.nextLine();
				System.out.println("Please enter the mail content to send: ");
				String content = sc.nextLine();
				
				Mail mail = new Mail();
				mail.setReceiver(receiverUser);
				mail.setSender(senderUser);
				mail.setTitle(title);
				mail.setContent(content);
				mailDB.save(mail);
				return;
			}
			else System.out.println("\nIncorrect e-mail address please try again!");
		}
		
	}
	// > --- Mail Case 3: End --- <
	// > --- Login Case 2: End --- <
	
	// > --- Login Case 7: Start --- <
	private static void changeMobile (User user){
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		System.out.println("### Changing Phone Number");
		user.setPhoneNumber(askUserPhoneNumber());
		userDB.update(user);
	}
	// > --- Login Case 7: End --- <
	
	// > --- Login Case 8: Start --- <
	private static void changeEmail (User user){
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		System.out.print("### Changing Email Address ###");
		user.setMail(askMail());
		userDB.update(user);
	}
	// > --- Login Case 8: End --- <
	
	// > --- Login Case 9: Start --- <
	private static boolean changePassword(User user){
		//TODO: Potansiyel iptal islemleri icin case yapisi kurulabilir.
		boolean isPasswordChanged =false;
		System.out.println("### Changing Password ###");
		System.out.print("Please enter your old password: ");
		String oldPass = sc.nextLine();
		if (user.getPassword().equals(oldPass)) {
			user.setPassword(askPassword());
			userDB.update(user);
			isPasswordChanged = true;
		}
		else {
			System.out.println("The old password entered incorrectly!");
		}
		return isPasswordChanged;
	}
	// > --- Login Case 9: End --- <
	// > --- Case 2 : End --- <
	
	// > --- Case 3 : Start --- <
	private static User changeForgottenPassword() {
		System.out.print("Please enter your ID: ");
		String tc = sc.nextLine();
		System.out.print("Please enter your e-mail address: ");
		String mail = sc.nextLine();
		
		User user = userDB.findByTcEmail(tc,mail);
		
		if (user == null){
			System.out.println("Information you entered are not match!");
			return null;
		}
		user.setPassword(askPassword());
		if (userDB.update(user) == null){
			System.out.println("Something went wrong!");
			return null;
		}
		return user;
	}
	// > --- Case 3 : End --- <
	
	// > --- Case 8 : Start --- <
	private static void generateData() {
		for (int i = 1; i< 10; i++){
			User user = new User();
			user.setName("user"+ i);
			user.setSurname("user surname"+ i);
			user.setMail(user.getName()+ "@gamail.com");
			user.setPhoneNumber("1122334455"+i);
			user.setTcNo("1122334455"+i);
			user.setUserName(user.getName());
			user.setPassword("12345678");
			user.setBirthDay(LocalDate.of((1990+i),i,i));
			userDB.save(user);
		}
	}
	// > --- Case 8 : End --- <
	
	// > --- Case 9 : Start --- <
	private static List<User> showUsers() {
		List<User> userArray = userDB.findAll();
		if (userArray.size() == 0){
			System.out.println("There are no users logged in yet!");
		}
		else userArray.forEach(System.out::println);
		return userArray;
	}
}