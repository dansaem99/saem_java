package ch04.ex05;

public class C03ByTwo {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i <= 10; i += 2) {
			sum += i;
			System.out.printf("+%d: %d\n", i, sum);
		}
	}
}


//debug 버그를 잡는 