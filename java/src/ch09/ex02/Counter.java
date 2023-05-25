package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		//run = 쓰레드가 할 일이지, 쓰레드가 아니다.
		//현재 작동중인 쓰레드를 리턴시킨다.
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() +": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				//내가 할 수 있는 것은 vm에게 sleep(멈춰)달라고 요청하는 것 뿐이다.
				Thread.sleep(1000); //단위는 밀리세컨드 1000밀리세컨드동안 재우는 것이다.
				//런 메소드가 이끄는 쓰레드가 잠을 잘 것이다.
			} catch(InterruptedException e) {
				//슬립을 방해받는 것이다. sleep1000을 콜한 쓰레드가 자는 놈을 깨우는 Notify
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
				//currentThread()를 콜한 쓰레드가 리턴된다.
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}