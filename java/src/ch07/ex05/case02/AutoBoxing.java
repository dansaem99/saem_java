package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}
	
	private static int add(Integer a, Integer b) {
		return a + b;
	}
}

/* AutoBoxing 기본 타입 데이터에 대응하는 Wrapper 
* 클래스로 만드는 동작이다.
* AutoUnBoxing : Wrapper 클래스에서 기본 타입으로 변환
*/