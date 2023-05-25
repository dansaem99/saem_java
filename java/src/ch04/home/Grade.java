package ch04.home;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;  //10의 자리
		oneDigit = score % 10;	//1의 자리
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit == 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.print(grade);
				
		
		/*int score = 0;
		char grade = 0;
		char grade2 = 0;
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		
		if(score >= 98 || score >= 88 && score < 90) grade2 = '+';
		else if(score < 94 && score >= 90|| score < 84 && score >= 80) grade2 = '-';
		else grade2 = ' ';
		
		System.out.printf("%s%s", grade, grade2);*/
	}
}

/*
다음 구간별로 학점을 부여하라.  해결완료
98이상 A+
94이상 A
90이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수 : 100
A+
*/