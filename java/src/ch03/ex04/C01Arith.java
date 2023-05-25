package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		//IO 타입은 32비트이다.
		//산술연산자의 타입은 같아야 한다.
			byte a = 3;
			byte b = 2;
			//byte c = a + b;  
			//과제 : 컴파일러 오류를 없애라.
			byte c = (byte)(a + b);
			System.out.println(c);
			
			//c = c + 1;
			c++;
			System.out.println(c);
			/*
			 * double d = a / b;
			 * System.out.println(d);*/   //이렇게 계산하면 1.0이 나온다.
			
			//과제 : 1.5의 값이 나오게 하라.
			double d = (double)a / b;  //3.0을 만든 후 2로 나누면 1.5가 나온다.
			System.out.println(d);
			d = 1.0 * a / b;  //또 다른 방법
			System.out.println(d);
			
			d = (double)(a / b);
			System.out.println(d);
			d = a / b * 1.0;
			System.out.println(d);
			
	}
}
