package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start."); //실타래가 풀렸구나
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++) 
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(()-> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		//시간을 쪼개가면서 병렬 처리를 시키는 것이다.
		
		System.out.println("main end."); //실이 끊겼구나
	}
}

/* 메인이 할일이 적어서 빨리 끝났다. 
 * Thread는 할일이 많기 때문에 메인보다 일을 늦게 시작하고
 * 늦게 끝났다.
 */