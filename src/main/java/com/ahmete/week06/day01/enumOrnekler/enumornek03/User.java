package com.ahmete.week06.day01.enumOrnekler.enumornek03;

public class User {
	private String username;
	private String password;
	private EUserStatus userStatus;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public EUserStatus getUserStatus() {
		return userStatus;
	}
	
	public void setUserStatus(EUserStatus userStatus) {
		this.userStatus = userStatus;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				", userStatus=" + userStatus +
				'}';
	}
}