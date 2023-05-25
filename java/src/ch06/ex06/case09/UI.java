package ch06.ex06.case09;

public interface UI {
	static String in() {
		return "키보드로 입력하다.";
	}
	
	String out();
} //출력은 UI에서 바디를 구현할 수 없다.