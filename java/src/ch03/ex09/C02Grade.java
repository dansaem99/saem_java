package ch03.ex09;

public class C02Grade {
	public static void main(String[] args) {
		int score = 50;
		char grade = score >= 90 ? 'A' : (score >= 80 ? 'B' : 'C');
		System.out.println(grade);
	}
}
