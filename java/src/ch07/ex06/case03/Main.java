package ch07.ex06.case03;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>();
		Bowl<String> bowl2 = new Bowl<>();
		
		bowl1.setVal(1);
		bowl2.setVal("hello");
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
	}
}