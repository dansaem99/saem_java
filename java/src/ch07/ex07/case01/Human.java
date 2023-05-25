package ch07.ex07.case01;

@FunctionalInterface
public interface Human {
	void say(); 
	//void tell();
}

/* 
 * 메소드를 하나만 정의할 수 있다.
 * say가 매소드이며 human이 변수이다.
FunctionalInterface(함수형 인터페이스)
인터페이스의 익명 구현 객체를 생성한다는 의미이다.
이는 일반적으로구현해야할 추상 메소드가 하나만 정의된
인터페이스를 가리키며 두개이상의 메소드가 선언되면
오류를 발생시킨다.

*/

