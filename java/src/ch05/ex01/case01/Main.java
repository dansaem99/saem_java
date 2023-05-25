package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf ("%d시 %d분 %d초\n", hour, minute, second);
		// 하나의 데이터라는 것을 모른다.
		
		Time time = new Time(); //기본값 초기화
		time.hour = 12; //time객체
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n",time.hour, time.minute, time.second);
		//하나의 데이터라는 것을 보여준다.
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n",time2.hour, time2.minute, time2.second);
	
		System.out.println(time);
		System.out.println(time2.toString());
		//toString타입의 문자값을 만들어서 리턴해준다.(주소값 리턴)
	} 
}

//메소드바디 안에 알고리즘을 구현합니다.
/* 객체는 필드에서 자동으로 초기화 된다.
 * 각 타입별 기본값은 0,"",'',false 
 */