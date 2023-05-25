package ch08.ex04.case02;

public class NumberException extends RuntimeException {
	public NumberException(String msg) {
		super(msg);
	}
}
/* 
 * RuntimeException으로 하면 main 14번쨰 줄 코드처럼 
 * 간결하게 표현할 수 있다. 만약 상속 받을거면 RuntimeException
 * 을 상속 받는 것을 추천한다.
 */