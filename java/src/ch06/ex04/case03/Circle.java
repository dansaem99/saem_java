package ch06.ex04.case03;

public class Circle extends Point {
	private int r;
	
	public Circle (int x, int y, int r) {
		super(x, y);
		this.r = r;
	}//유지보수 관점에서 나쁜 코드이다.
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d ", this.getX(), this.getY(), r);
	}
}

//나쁜 코드이다 Circle is a Point(점은 원이다) 가 되어버려서
//원의 정의가 이상하게 디자인 되었다.