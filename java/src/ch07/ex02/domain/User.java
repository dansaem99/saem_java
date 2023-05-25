package ch07.ex02.domain;

public class User {
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return this.userName;
	}
}
