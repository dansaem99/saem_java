package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
private static Scanner sc;

	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		boolean isGood;
		do {
			Console.inMsg(msg);
			String tmp = sc.nextLine().trim();
			isGood = tmp.matches("[a-zA-Z가-힣0-9]+");
			tmp = msg;
			if(!isGood) Console.err("문자가 아닙니다.");
		} while(!isGood); 
		return msg;
		}
	
	public static int inNum(String msg) {
		boolean isGood;
		int num = 0;
		do {
			Console.inMsg(msg);
			String tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			String tmpFirst = tmp.substring(0);
			isGood = !tmpFirst.matches("[0]");
			if(isGood) num = Integer.parseInt(tmp);
			if(!isGood) Console.err("자연수가 아닙니다.");
		} while(!isGood);
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
