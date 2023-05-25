package ch09.ex03;

public class Counter {
	private int val;//공유자원을 만들다. ex) 화장실에 있는 변기
	
	public synchronized void increase() {
		val++;
	}
	/*계산작업은 CPU가 한다. 
	CPU입장에서는 VM은 플레이어들 중 한명일 뿐이다.*/
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
//화장실 변기에 synchronized 락을 건다.