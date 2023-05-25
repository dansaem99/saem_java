package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		//x = this.a; 컴파일 에러 private
		//x = this.b; 컴파일 에러 default
		x = this.c; //protected(같은 패키지나 상속된 자식에게 보여준다.)
		x = this.d;
		
		//this.m1(); 컴파일 에러 private
		//this.m2(); 컴파일 에러 default
		this.m3();
		this.m4();
	}
}

//a,b,c,d 다형성 