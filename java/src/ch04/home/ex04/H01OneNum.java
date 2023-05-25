package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double input = 0.0;
		String text = "";
		
		do {
			System.out.print("한자리 자연수를 입력하시오.\n: ");
			input = sc.nextDouble();
			text = sc.nextLine();
			
			if(input % 1 != 0) {
				System.out.println("조건에 맞지 않습니다.");
			}
			
			
			
		} while(!(0 < input && input < 10));
		System.out.println("끝");
	}
}
/*과제: 한자리 자연수를 입력받아라.*/
