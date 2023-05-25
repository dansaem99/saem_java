package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if (hour < 18 ) {
			System.out.println("Good Afternoon.");
		} else if (hour < 21) {
			System.out.println("Good Evening.");
		} else {
			System.out.println("Good night.");
		}//나쁜 코드 println이 4번 반복된다.
		
		//과제 : 7 ~ 15 line을 개선하라 
		//.println을 1번만 사용하라.
		
		String bow = "";
		if(hour < 12) bow = "Good Morning.";
		else if(hour < 18) bow = "Good Afternoon.";
		else if(hour < 21) bow = "Good Evening.";
		else bow = "Good night.";
		System.out.println(bow);
	}
}



//int score = 50;
//char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
//System.out.println(grade);