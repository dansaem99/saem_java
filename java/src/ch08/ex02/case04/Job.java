package ch08.ex02.case04;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL;
	
	public static final Job valueOf(int ordinal) {
		return values()[ordinal];
	}
}
//각각의 entry를 숫자로 불러 오겠다는 것이다.

/* HR에서 활용 프레젠테이션 계층에서 구현하면 됩니다....
 *  프레젠테이션에서 가장 시간을 많이 쓸 것이야..
 */