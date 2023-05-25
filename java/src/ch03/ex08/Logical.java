package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0; 
		/*y가 왜 0인가 and나 or연산자는 이미 앞에서 false가 나오면 
		 * 뒤의 값을 계산하지 않는다.*/
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0; 
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		System.out.printf("x: %d, y: %d, b: %b\n", x, y, b);
		
		
	}
}
