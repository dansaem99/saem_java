package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start");
		/*메인 메소드가 실행되는 순간 메인 쓰레드가 시작된다. 
		 * 현재 쓰레드는 메인 스레드다. 그렇기 때문에 메인 스레드의 네임이 리턴된다.
		 */
		
		Thread counter = new Thread(new Counter());
		//쓰레드로 포장을 해 주면 보자기 싸듯이 쓰레드가 되는 것이다.
		counter.start(); //VM에게 쓰레드를 작동 시켜달라고 요청한 것이다.
		//실행은 VM이 알아서 한다.
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000);//카운터가 가지고 있는 조인을 메인이 콜했다.(카운터를 지켜보고 있다.)
				System.out.println(Thread.currentThread().getName() + ": wait" + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");
				counter.interrupt();
				//카운터를 깨워달라고 VM에게 요청. 카운터 쓰레드 입장에서는 인터렙트 익셉션이 발생한다.
				counter.join();//이제는 카운터가 할일 끝날 때까지 무한정 기다린다.
			}
		}
			//메인 스레드가 counter스레드 살아있는지 수시로 조사를 한다.
		//카운터 스레드가 살아 있으면 2번 정도 양보할 것이다. tries는 양보할 횟수다.
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
//서로 시간을 경쟁할 뿐 자원을 가지고 다투지는 않는다. 자원을 가지고 다투려면 lock이 필요하다.