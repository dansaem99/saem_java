package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		
		i = i + 2;
		i += 2; //7번의 코드를 다음과 같이 줄여 쓸 수 있다.
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}
}