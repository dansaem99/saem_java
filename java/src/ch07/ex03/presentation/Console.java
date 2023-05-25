package ch07.ex03.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static String inStr(String msg) {
		System.out.print(msg + "\n> ");
		return sc.nextLine().trim();
	}
}