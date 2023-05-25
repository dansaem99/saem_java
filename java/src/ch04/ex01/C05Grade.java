package ch04.ex01;

public class C05Grade {
	public static void main(String[] args) {
		int score = 45;
		char grade = 0;
		
		if(score >= 90) grade = 'A';
		else if(score >= 80) grade = 'B';
		else grade = 'C';
		
		System.out.println(grade);
	}
}
