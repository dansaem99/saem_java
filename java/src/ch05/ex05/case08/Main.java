package ch05.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Mom mom = new Mom();
		Child child = new Child();
		
		child.eat(mom.cook());
	}
}