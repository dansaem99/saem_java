package ch07.ex04.case04;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
				{90, 90, 90},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		System.out.println("번호 국어 영어 수학 합계 평균");
		System.out.println("------------------------------");
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			//i 가 인덱스 값 각각의 row
			
			System.out.print(" " + (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) {
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}//scores[0].length는 3이다.
			System.out.printf("%5d %4d\n", sum, sum/ scores[i].length);
		}
	}
}