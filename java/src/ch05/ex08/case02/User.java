package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public User() {}
	
	public User(String userName, int age, LocalDate regDate) {
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}//맴버변수를 통째로 초기화

	public void setUserName(String userName) {
		this.userName = userName;
	}//세터는 하나씩 초기화

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}