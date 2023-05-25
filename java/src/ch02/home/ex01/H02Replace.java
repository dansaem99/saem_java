package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");  // presentation logic, IO(Input/Output)
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d, b: %d\n", a, b);
		
		System.out.println("=> a, b 값을 교체합니다.");
		int temp = 0; // business logic
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("=> a: %d, b: %d", a ,b);
		
		/*System.out.print("숫자 A를 입력하세요.\n> ");
		int a = sc.nextInt();
		System.out.println (a +"을 입력했습니다.");
		
		System.out.print("숫자 B를 입력하세요.\n> ");
		int b = sc.nextInt();
		System.out.println (b +"을 입력했습니다.");
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.print("A와 B의 값이 교체되었습니다.\n> ");
		System.out.printf("%d, %d\n", a, temp);*/
	}
}

//과제 H01을 확장성 있게 고도화하라.
