package ch07.ex01.case02;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;
		A a = c;
		Object o = c;
		
		c = (C)o;
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
	}
}
