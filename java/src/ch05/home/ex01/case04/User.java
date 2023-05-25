package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private String age;
	private LocalDate joinDate;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	
	public LocalDate getJoinDate() {
		return joinDate;
	}
	
	
	
}
