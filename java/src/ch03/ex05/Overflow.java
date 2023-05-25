package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);   //변질된 값 발생
		
		c = (long) a * b;
		System.out.println(c);
		
		int x = a * b /a;
		System.out.println(x);    //변질된 값 발생
		
		x = a / b * a;
		System.out.println(x);    //나눗셈을 먼저 해주면 해결된다.
	}
}
