package ch06.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("야코미", 3);

		//과제: 콘솔에 null 0 이 출력되도록 하라.
		
		cat = new Cat(null , 0); 
		
		System.out.println(cat);
	}
}