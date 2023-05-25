package ch06.ex04.case02;

public class Circle {
	private int x;
	private int y;
	private int r;
	
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, r);
	}//객체를 구별하려고
}