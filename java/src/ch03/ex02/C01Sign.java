package ch03.ex02;

public class C01Sign {
	public static void main(String[] args) {
		int i = -10;
		i = +i;  //곱하기 1을 한다
		System.out.println(i);
		
		i = -10;//10에다가 -1을 곱했다.
		i = -i;
		System.out.println(i);
	}
}
