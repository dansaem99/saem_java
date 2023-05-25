package ch05.ex05.case02;

public class Calculator {
	public double add(int a, int b) {
		return a + b;
	}
	//int 값을 double로 프로모션 시킨다.
	
	public double add(double a, double b) {
		return a + b;
	}
	//이 코드 또한 오버로딩이다.
}