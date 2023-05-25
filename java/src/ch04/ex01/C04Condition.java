package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if (0 < a && a < 4) System.out.println("good.");
		
		//과제 : b값이 'a'초과 'c'미만 범위에 있으면, good을 말하라.
		
		char b = 'b';
		
		if ('a' < b && b < 'c') System.out.println("good.");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0);
			System.out.printf("x: %d, y: %d\n", x, y); 
			//앞에서 이미 true가 나왔기 때문에 y값은 처리 하지 않는다.
			
		String s = "he";
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println("he");
		//과제: 위 조건문의 중복을 제거하라.
		s = "he";
		if(s.equalsIgnoreCase("he")); //로지컬한 데이터로 비교한다.
		System.out.println("he");
		
		s = "";//초기화
		if(s.equals("")) System.out.println("값이 없다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
