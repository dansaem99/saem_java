package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);//계산기가 add하다.
		//메인메소드가 add를 call했다.
		//VM이 메인메소드를 call한다.
		result = calculator.add(1, 2, 3); 
		System.out.println(result);
	}
}