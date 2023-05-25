package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a; privite라서 볼 수 없다.
		x = a.b; //default에 패키지가 같은 객체이기에 볼 수 있다.
		x = a.c; //protexted 패캐지가 같기에 접근 가능하다.
		x = a.d; //public
		
		//a.m1();
		a.m2(); //default
		a.m3(); //protexted
		a.m4(); //public
	}
}
//객체지향은 코드 중복을 없애기 위해 사용한다.