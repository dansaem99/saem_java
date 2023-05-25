package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 1;
		String coupon = "";
		
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		//case 3 -> coupon = "1천원";
		default -> coupon = "1천원"; //기본값
		}
		
		System.out.println(coupon);
	}
}
