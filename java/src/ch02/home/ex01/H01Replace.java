package ch02.home.ex01;

public class H01Replace {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		 
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("%d ,%d\n" ,temp ,a);
	}
}

//과제 : 두 변수의 데이터를 교환하라.
/* a 값을 다른 변수에 할당시킨다. 
 * 그러면 a값이 죽어도 a의 정보는 남아있게 된다.*/