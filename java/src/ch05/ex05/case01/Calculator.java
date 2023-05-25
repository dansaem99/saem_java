package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	/*
	public int add(int x, int y) {
		return x + y; 
	} 메소드 네임이 중복되면 안된다. (컴파일 오류)
	*/
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	/*해당 코드는 add int int int 코드 이므로 이름 중복이 아니다.
	 * overloading 하나의 클래스에 이름이 같고 파라미터가 
	 * 다른 메서드를 2개 이상 정의하는 것이다.
	 */
}