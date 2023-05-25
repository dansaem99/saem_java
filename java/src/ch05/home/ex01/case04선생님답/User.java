package ch05.home.ex01.case04선생님답;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getRegDate() {
		return regDate;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}