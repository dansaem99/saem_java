package ch06.ex02.case01;

public class A {
	private int a; //가장 좁은 범위
	int b; //dafault package가 똑같은 객체들 끼리만 보인다.
	protected int c; //상속이 전제 되어야 한다. 
	//5번 줄 처럼 같은 package에서만 보인다. 그러나 다른 package에 있어도 자식이면 보인다.
	public int d;//가장 넓은 범위
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
	
	class B {
		
	}//안드로이드 쪽에서 많이 사용하나 나쁜 코드 유지보수가 힘들다. 
	//class가 파일명에 없고 숨겨져 있기 때문이다.
}