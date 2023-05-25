package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {	
		new Init();
		new Init();
		
		new Init(1); 
		//생산자를 call할지 말지 선택 할 수 있다.
	}
}
//static > instance> 생성자 순으로 호출 된다.
//instance = 생성자 객체생성 직후 호출된다. (실행 순서 차이)