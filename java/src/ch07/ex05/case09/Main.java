package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";
			//C객체가 c클래스의 인스턴스인다.
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		//왼쪽의 객체가 오른쪽 클래스에 포함될 가능성이 있어야 한다.
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		//C클래스에 엮여 있는 A,B,C의 영향을 받았다.
		
		//if(b instanceof F)
		//if(c instance of F)
		//객체가 가질 가능성이 전혀 없기에 컴파일에러
		
		F f = new F();
		msg = "";
		//if(f instanceof C)
		if(f instanceof A) msg += "A ";
		//A의 경우는 인터페이스이다. 인터페이스는 굳이 따지지 않는다.
		//우리는 주로 오른쪽에 인터페이스를 둘 것이다.
		System.out.println(msg);
	}
}
