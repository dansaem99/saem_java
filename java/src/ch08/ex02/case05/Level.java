package ch08.ex02.case05;

public enum Level {
	GOLD(3, null) , SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	//코드니까 값을 바꾸면 안된다.
	private final Level next;
	//다음단계
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	
	public int value() {
		return this.value;
	}
	
	public Level next() {
		return this.next;
	}
}

//3등급의 레벨을 만들 것이다.