package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		}; //2개 이상 명령어 써야할 때 블럭을 써야한다.
		
		calculator = (a, b) -> a + b;
		
		System.out.println(calculator.calc(1, 2));
	}
}

/*데이터 타입 쓸 필요 없이 변수만 2개 쓰고, 
파라미터 가지고 만들어 내는 리턴값(생략 되어있다.)
만 작성해 주면 된다.*/