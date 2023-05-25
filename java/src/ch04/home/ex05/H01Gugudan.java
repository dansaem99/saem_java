package ch04.home.ex05;

public class H01Gugudan {
	public static void main(String[] args) {
		int multi= 0;
		for (multi = 2; multi <=9; multi++) {		
			for (int i = 1; i <= 9; i++)
				System.out.printf("%d * %d = %d\n",multi , i ,multi * i);
			System.out.println();
		} 
	}
}

/*과제 : 구구단을 출력하라. 

2 * 1 = 2
2 * 2 = 4
....
2 * 9 = 18
......

...

9 * 9 = 81
*/