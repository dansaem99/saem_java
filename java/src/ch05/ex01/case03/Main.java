package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		//user.userName 컴파일 에러 발생 private이기 때문에.
		//encapsulation
		
		user.setUserName("최한석");
		user.setAge(12);
		
		user.setUserName("한아름");
		user.setAge(43);
		
		System.out.printf("%s, %d", user.getUserName(), user.getAge());
	}
}
//run버튼 누르면 java VM을 실행 시키는 것 이다.