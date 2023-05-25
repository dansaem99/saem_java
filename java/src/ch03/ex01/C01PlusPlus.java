package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i; //변수 앞 뒤 상관없이 쓸 수 있지만 주로 변수 뒤에 쓴다.
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0; //초기화
		int j = ++i; //선언은 한번만
		System.out.printf("i: %d, j: %d\n", i, j);
		
		i = 0; //초기화
		j = i++;  // 이러한 형태가 되면 j와 i의 할당이 우선되고 ++이 나중이 되므로 j는 0이된다.
		System.out.printf("i: %d, j: %d\n", i, j);
		
	}
}
