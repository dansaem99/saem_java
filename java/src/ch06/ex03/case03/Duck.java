package ch06.ex03.case03;

//import java.lang.*; 문구는 자동으로 추가된다.

public class Duck extends Object {
	@Override
	public String toString() {
		return "오리";
	}
}

//extends Object 문구는 자동으로 추가된다.
//모든 class의 superClass(root)는 Object이다.
//extends 뒤에는 클래스 하나만 둘 수 있다.