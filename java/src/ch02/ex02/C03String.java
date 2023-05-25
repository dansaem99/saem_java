package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;
		System.out.println(sumStr);
		
		int i = Integer.parseInt(sumStr);
		System.out.println(i);
		
		String s = a + b + "";
		System.out.println(s);
		//console에 보이는 것은 숫자 3이 아닌 문자 3이다.
		
		s = "" + a + b;
		System.out.println(s);
		//"" + a(1)이 문자로 바뀌고 붙이기 b가 된다.
		//문자 12가 할당이 된다.
		
		String dialog = "John said, \"hello\".";
		System.out.println(dialog);
		//""은 String 타입을 나타내는 특수문자이다.
		//일반 문자로 사용하고 싶다면 특수문자 앞에
		//역슬래시 \을 붙여주면 된다.
	}
}
