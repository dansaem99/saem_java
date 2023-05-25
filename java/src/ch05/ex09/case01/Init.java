package ch05.ex09.case01;

import ch05.home.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1; 문법상 실행 될 리가 없다.
		Console.info("static{}");
	}//문법상 기본값이 아닌 업무상 기본값으로 초기화 하고 싶을 때 사용한다.
	//거의 안쓴다 메모리 낭비가 크기 떄문에.
	
	{
		this.i = 1; //문법상 바이트 코딩 로딩 된 후 실행 되므로 this가 가능하다.
		Init.s = 1; //가능하지만 가독성은 static 초기화가 더 좋으므로 잘 안쓴다.
		Console.info("{}");
	}//instance block
	
	{
		Console.info("{}2");
	}//instance는 이름이 없다 보니 서로 구분이 안된다. 
	//위쪽 {}에 넣으면 그만이다.
	
	
	public Init() {
		Console.info("Init{}");
	} //기본생성자를 추가해 줘야 컴파일 에러가안난다.(main의 9, 10)
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}//static은 바이트코드가 로딩되는 순간 실행되기에 한번만 실행된다. 
//나머지는 instance variable이 생성될 때 실행된다.