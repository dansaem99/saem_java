package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false;
		bl = true;
		
		byte b = 0;  //statement(명령문)
		short s = 0;
		char c = 0;
		int i = 0;
		long l = 0;
		float f = 0.0f;
		double d = 0.0;
		
		String str = "hello";
		
/* 		char type 데이터 5개를 한자리에 모아서(배열) 처리한다.
 * 		로그인, 패스워드 등은 대부분 string 을 쓴다.
 * 
 *      char은 문자 하나만 쓰는데 현장에서는 쓸 일이 거의 없기 
 *      때문에 string을 쓴다.
 */
		
		int a;
		a = 0; //initialization(초기화)
		
		int x;
		int y;
		//int x, y; 이렇게 쓸 수 있지만 나쁜 코드이다.
		//int x2 = 0, y2 = 0; 나쁜 코드이다.
	}
}

/*5번은 bl이라는 변수를 만든다 라는 의미이다. 
 * 이때 bl변수가 boolean 타입이라는 의미이다. 
 * (bl변수를 선언했다) boolean 은 유일해야 한다. 
 * 똑같은 변수를 선언하려하면 에러가 발생한다.*/

/*6번은 이미 만들었기 때문에 
 * 존재하는 bl변수를 사용한다는 의미이다.*/

/*8-12번은 로지컬하게 전부 0이지만 크기는 다르다.*/

/*13번은 constant는 double인데 float 타입이기 때문에 에러가
 * 발생한 것이다. 이때에는 constant가 float 타입이라는 걸
 * 지정해 주기 위해 f라는 데이터를 넣어준다. */

