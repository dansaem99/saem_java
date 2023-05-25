package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;		
	}
	/* paper의 a b result를 써서 가지고 오면 
	 * add가 paper에 다시 집어넣는다.
	 */
	//과제 : paper의 a, b 값을 더한 result를 paper에 적어라.
	//       위 paper를 return하라.
}
//public Paper add(Paper paper) {
//	return paper.getResult(paper.getA() + paper.getB()); 
//}