package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] arg) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		//과제 : pi 값을 소수점 이하 세자리로 조정하라.
		
		shortPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		//과제 : pi 값을 반올림해서, 소수점 이하 세자리로 조정하라.
		
		shortPi = Math.round(pi * 1000) / 1000.0;  
		System.out.println(shortPi);
		//pi값을 3141.5로 만든 후 소수점 이하를 반올림해 잘라버린다. 
		//그럼 3142가 된다. 이 값을 1000.0으로 나누면 정답이다.
		
		
	}
}
