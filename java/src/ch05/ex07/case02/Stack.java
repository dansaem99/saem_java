package ch05.ex07.case02;

import ch05.home.ex06.case02.Console;

public class Stack {
	public static void first() {
		Console.info("first() start.");
		
		int a = 0;
		Stack.second();

		Console.info("first() end.");
	}
	
	public static void second() {
		Console.info("second() start.");
		
		int a = 0;
		
		Console.info("second() end.");
	}
}