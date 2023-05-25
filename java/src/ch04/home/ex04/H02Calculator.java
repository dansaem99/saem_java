package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		int result = 0;
		String op = "";
		boolean yes = false;
		boolean isGood = false;
		
		do {
			do {
			System.out.print("a: ");
			a = sc.nextLine();
			isGood = a.matches("[0-9]*");
			} while(!isGood);
			
			int a2 = Integer.parseInt(a);
			
			System.out.println("op: ");
			op = sc.nextLine(); 
			
			do {
			System.out.println("b: ");
			b = sc.nextLine();
			isGood = b.matches("[0-9]*");
			} while(!isGood);
			
			int b2 = Integer.parseInt(b);
			
			switch(op) {
			case "+" -> result = a2 + b2; 
			case "-" -> result = a2 - b2;
			case "*" -> result = a2 * b2;
			case "/" -> result = a2 / b2;
			default -> System.out.println("+ - * / 중에 입력하세요.");
			}
		
			System.out.printf("%d %s %d = %d\n", a2, op, b2, result);
			
			System.out.println ("continue(y/n)?");
			yes = sc.nextLine() .equalsIgnoreCase("y");
		}while(yes);
		System.out.print("end.");
	}
}
/*
 * 과제: 계산기를 만들어라.
 * 연산자는 +, -, *, / 이다.
 /는 몫만을 구한다. 입력값 a,b는 0또는 자연수이다.
--

a: 1
op: +
b: 2
1 + 2 = 3

continue(y/n)? y

a: 2
op: *
b: 2
2 * 2 = 6

continue(y/n)? n

end

		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
int i = Integer.parseInt(sumStr);

*/