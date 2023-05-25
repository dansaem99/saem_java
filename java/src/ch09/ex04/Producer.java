package ch09.ex04;

public class Producer implements Runnable {
	private String producerName;
	private Buffer buffer;
	
	public Producer(String producerName, Buffer buffer) {
		this.producerName = producerName;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			buffer.add(i);
			System.out.println(this.producerName + ": " + i);
			
			try {
				Thread.sleep((int)(Math.random() * 100));
			} catch(InterruptedException e) {}
		}
	}
}
