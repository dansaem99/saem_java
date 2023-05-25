package ch05.ex01.case03;

public class User {
	private String userName;
	private int age;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) { //setter
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) { //getter
		this.age = age;
	}
}
/* public: 공개적이다 
 * private: 감춘다. 사적이다.
 * 이때 access 할 수 있는 메서드를 만들면 접근 가능하다.
 */

/*this타입의 변수는 User다
filed는 userName과 age이다. 
public void setUserName(User this, String userName)
User this 변수 선언은 쓰지 않아도
자동으로 작성되므로 쓰지 않아도 된다.
this. 하면 주소를 찾아가고 그 곳에 데이터를 가져간다.
쓰기는 set 읽기는 get이 관례이다.*/

/* 위에 변수 선언하고 오른쪽 마우스 소스 들어가서
 * getter and setter 눌러서 select all 시키면 자동으로
 * 위의 코드가 만들어진다.*/

//domain을 디자인 할때 데이터들은 캡슐화를 해야한다.