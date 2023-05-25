package ch09.ex03;

public class Player extends Thread{
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			//+ 1 됐다가 바로 -1 되므로 0이어야 한다.
			
			if(i % 10 == 0) counter.print();
			//10단위로 바꾸다 보기 좋게.
			
			try {
				Thread.sleep((int)(Math.random() * 2));
			} catch(InterruptedException e) {}
		}
	}//쓰레드가 Runnable이기도 하기에 run을 이미 가지고 있다.
}
