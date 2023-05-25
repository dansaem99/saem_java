package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say();
	
	static void walk() {
		System.out.println("Human walk");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
/*추상 메소드가 아닌 메소드(static, dafault)는 개수 제한 없이 
넣어 줄 수 있다.*/