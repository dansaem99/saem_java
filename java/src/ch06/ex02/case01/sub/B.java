package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a; privite라서 볼 수 없다.
		//x = a.b; default에 패키지가 다르다.
		//x = a.c; protexted 패캐지가 다르고 자식 관계도 아니다.
		x = a.d; //public
		
		//a.m1();
		//a.m2(); default
		//a.m3(); protexted
		a.m4(); //public
	}
	//컴파일 에러, 컴파일이 같은 패키지에서 찾고 안되면 라이브러리에서 찾는다.
	//이것도 안되면 수동으로 import해준다.
}