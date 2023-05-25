package ch05.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.setA(1);
		box.setB(2);
		
		int result = box.getA() + box.getB();
		result = box.getA() - box.getB();
		
		System.out.println(result);
	}
}