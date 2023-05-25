package ch06.home.ex03.case03;

public class User {
	private String userName;
	private int age;
		
	public User(String userName, int age) {
			this.userName = userName;
			this.age = age;
		}
	
	@Override
	public String toString() {
		return String.format("%s %d살", userName, age);
	}
}

//슈퍼생산자는 내 부모클래스를 call할 때 쓴다.
//this 생산자는 나를 call한다.

//String 의 static 메서드인 format 메서드는 
//문자열의 형식을 설정하는 메서드입니다.