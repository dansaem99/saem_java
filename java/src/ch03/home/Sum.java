package ch03.home;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		/*System.out.println("a: "); a = sc.nextInt();
		System.out.println("b: "); b = sc.nextInt();
		System.out.printf("%d " + "+ " + "%d " + "= " + ( a + b ), a ,b);*/
		
		System.out.print("a: "); 
		a = sc.nextInt();
		System.out.print("b: "); 
		b = sc.nextInt();
		System.out.printf("%d + %d = %d", a, b, a + b);
	}
}

/*
 * 과제: 두 자연수를 입력받아, 그 합계를 출력하라.
 * 
 * a: 1
 * b: 2
 * 1 + 2 = 3
 */
