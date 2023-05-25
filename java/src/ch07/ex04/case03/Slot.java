package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	} //공 45개를 집어 넣다.
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	} //0 - 44까지의 정수
}
//랜덤 중복 제외 하나의공이 2번 이상 나오는 버그를 해결하라.