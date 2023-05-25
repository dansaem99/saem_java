package ch07.ex03.domain;

public class User {
	private String userName;
	
	public User(String userName) {
		this.userName = userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return this.userName;
	}
}


/* 
 * System.out.println(인스턴스의 이름)을 호출 했을 때 
 * 출력 될 문자열을 지정할 수 있다.
 */
