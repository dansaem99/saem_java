package ch05.home.ex02.case02;

import java.util.Scanner;

import ch05.ex02.case02.Board;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "";
		String writerName = "";
		
		boolean isGood = false;
		
		do {
			System.out.print("메세지: ");
			message = sc.nextLine();
			isGood = message.length() > 0;
			if(!isGood) System.out.println("ERROR] 1글자 이상 입력하세요.");
		}while(!isGood);
		
		do {
			isGood = false;
			System.out.print("이름: ");
			writerName = sc.nextLine();
			isGood = writerName.matches("[a-zA-Z가-힣]+");
			if(!isGood) System.out.println("ERROR] 이름을 입력하세요.");
		} while(!isGood);
		
		Paper paper = new Paper();
		paper.setMsg(message);
		paper.setWriter(writerName);
		
		System.out.printf("%s from %s.",
				paper.getMsg(),paper.getWriter());
	}
}
/*
과제: 종이에 메세지와 작성자명을 기록하라.
--

메세지: hello
작성자명: terry

hello from terry.
*/
