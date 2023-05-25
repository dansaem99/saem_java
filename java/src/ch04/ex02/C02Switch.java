package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "gold";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "5만원";  //코드 중복
		default -> coupon = "1천원";
		}
		
		switch(grade) {              // grade 값과 똑같은 데이터를 써야한다.
		case "gold","silver" -> coupon = "5만원";
		default -> coupon = "1천원";
		}
		
		System.out.println(coupon);
	}
}

/*
 * switch는 = 연산이다.
 * 즉, 좌 우의 데이터 타입이 같아야 = 연산이 가능하다.
 */