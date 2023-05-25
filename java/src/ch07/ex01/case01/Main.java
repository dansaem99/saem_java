package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		B b = c;  //C타입을 B로 프로모션 시켰다.
		A a = c;  //C타입을 A로 프로모션 시켰다.
		
		c = (C)a;//casting(강제변환)
		c = (C)b;
		
		b = (B)a;
		b = (B)c;
		
		//String s = (String)c; 내가 가지고 있는 타입 중에서만 변환 가능하다.
	}
}
//polymorphism 다형성
/* 부모를 큰수로 보고 자식을 작은 수로 봐서 casting을 하는 것이다.*/