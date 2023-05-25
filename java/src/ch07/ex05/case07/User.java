package ch07.ex05.case07;

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
