package ch04.ex04;

import java.util.Scanner;

public class C02InLength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int length = 0;
		
		do {
			System.out.print("한글자를 입력하세요.: ");
			input = sc.nextLine();
			length = input.length();
			System.out.println(length + "글자 입력했습니다.");
		} while(length != 1);//과제 : 한글자를 입력할 때까지 글자를 입력 받는다.
	}
}