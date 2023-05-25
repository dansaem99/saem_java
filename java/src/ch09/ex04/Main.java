package ch09.ex04;

public class Main {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		
		new Thread(new Producer("P1", buffer)).start();
		new Thread(new Producer("P2", buffer)).start();
		
		new Thread(new Producer("C1", buffer)).start();
		new Thread(new Producer("C2", buffer)).start();
	}
}
