package ch04.home.ex02;

public class H01Coupon {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		
		if(grade == 1) coupon = "5만원";
		else if(grade == 2) coupon = "1만원";
		else if(grade == 3) coupon = "1천원";
		
		System.out.println(coupon);
	}
}

/*
 * 과제: ch04.ex02.C01Switch를 if로 refactoring 하라.
 */

/* 
 * if는 여러개의 조건문이 들어 갈 수 있지만
 * Switch는 하나의 조건문만 들어가고 = 값만 비교할 수 있다.
 */