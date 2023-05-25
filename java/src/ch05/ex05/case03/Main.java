package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Paper paper = new Paper();
		
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		paper.setA(1);
		paper.setB(2);
		paper = calculator.add(paper);
		//calculator가 paper에 적힌 종이를 add한다.
		System.out.println(paper.getResult());
		//연산 작업은 cpu에서 한다.
	}
}