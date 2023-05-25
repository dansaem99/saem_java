package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		//소비자는 remove만 콜 한다. 먼저 remove차지한 놈이 락 걸고 나머지는 wait해야한다.
		while(val == null) {
			//널이면 생산자가 값 줄 때까지 기다린다.
			try {
				wait();//기다린다. 슬립은 어느 클레스에 있는 메소드인가?
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		this.val = null;
		notifyAll(); //불특정 다수를 깨운다.
		
		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}	
			this.val = val;
			notifyAll();
	}
}

/*버퍼링? 소비자는 버퍼에서 숫자 꺼내가고(remove) 생산자는 
 * 만들어 낸다.
 */