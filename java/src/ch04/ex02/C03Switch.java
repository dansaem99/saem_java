package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) {
		case 1 -> "sunday"; 
		case 2 -> "monday";
		case 3 -> "thuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday"; 
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none"; 
		};   //세미콜론 잊지 마세요.
		
		System.out.println(dayName);
	}
}
