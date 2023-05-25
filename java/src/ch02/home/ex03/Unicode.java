package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch, unicode);
		
		/*char i = 0;
		System.out.print("문자를 입력하시오.\n>");
		String text = sc.nextLine();
		System.out.print("문자: " + text);*/
		
		//System.out.print("\n");
		//System.out.println(i);
		//System.out.print(text + " 의 unicode는" + i + "입니다.");
	}
}

//과제 입력한 문자의 unicode를 출력하라.
//String API를 사용하지 않는다.

//문자: A
//A의 unicode는 65입니다.