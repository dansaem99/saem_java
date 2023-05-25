package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	//static 맴버변수를 초기화 할 때 위와 같이 쓴다.
	//바이트 코드가 로딩되면 sc변수가 생기고 
	//명령문도 바로 시작된다.
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim();
		//문자열 입력 받는다.
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}