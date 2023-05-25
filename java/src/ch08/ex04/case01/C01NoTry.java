package ch08.ex04.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = arr[10];
		System.out.println("끝.");
	}
}

/* 
 * 앱을 만들 때에는 버그를 최소화 시켜야한다.
 * 인기과 버그의 개수는 비례한다.
 */