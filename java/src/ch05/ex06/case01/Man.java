package ch05.ex06.case01;

public class Man {
	public static void say(String msg) {
		System.out.println(msg);
	}
	//static 메소드는 객체지향을 파괴한다.
	
	public void tell(String msg) {
		System.out.println(msg);
	}
}