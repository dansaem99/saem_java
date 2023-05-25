package ch08.ex04.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	public void second() {
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	*/
	
	public void first() {
		this.second();
	}
	
	public void second() {
		try {
			this.third();
		} catch (Exception e) {
			System.out.println("second()");
		}
	}
	
	public void third() throws Exception {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws(). first();
		System.out.println("end.");
	}
}

//런 했을 때 맨 밑부터 차례로 실행 된 것이다.