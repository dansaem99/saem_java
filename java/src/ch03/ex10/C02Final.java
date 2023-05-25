package ch03.ex10;

public class C02Final {
	public static void main(String[] args) {
		final int MAX = 3;   //변수를 상수로 만든다.
		//MAX = 1; 오류가 발생한다.
		
		double area = 3.14 * 3 * 3;
		//아래 코드처럼 활용하면 가독성이 높아진다.
		final double PI = 3.14;
		int r = 3;
		area = PI * r * r;
	}
}
