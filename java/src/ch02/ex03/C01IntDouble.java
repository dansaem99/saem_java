package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;    //작은 수를 큰수로 할당할 때에는 자동으로 casting이 일어난다.
		System.out.printf("%f, %d\n", d, i); //i변수의 경우 오른쪽 할당된 데이터가 없으므로 read 한 것이고 d변수의 경우 write이다.  
		
		d = (double)i;
		System.out.printf("%f, %d\n", d, i);
		
		//i = d; 자동 변환이 일어나지 않는다.
		i = (int)d; //d변수에서 read한 값을 i가 write한 것이 아닌 casting 연산자가 return한 값이다.
		System.out.printf("%f, %d", d, i);
		
	}
}