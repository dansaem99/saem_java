package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++) 
				System.out.print(c + " ");
		};
		//Runnable 타입의 데이터를 쓰레드로 포장하지 않고 다른 방법을 사용 하겠다 아래.
		
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1);
		executor.execute(r2);
		//newCachedThreadPool 익스큐터에 러너블 타입을 대입하면 쓰레드로 실행시키겠다.
	}
}