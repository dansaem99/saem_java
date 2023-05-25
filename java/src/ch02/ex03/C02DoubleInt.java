package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.92;
		int i = (int)d;
		System.out.println(i); //overflow 큰수를 작은 수로 변환
		
		double f = Math.floor(d); //소수점이하 내림처리
		double r = Math.round(d); //소수점이하 올림처리
		System.out.printf("%.2f, %.2f\n", f, r);
		
		int f2 = (int)f;
		int r2 = (int)r;
		
		System.out.printf("%d, %d\n", f2, r2);
	}
}
