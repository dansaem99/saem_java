package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		
		cats.add(new Cat("야코미"));
		cats.add(new Cat("새코미"));
		cats.add(new Cat("헤롱이"));
		
		System.out.println(cats);
		
		for(Cat cat: cats) cat.eat();
	}
}
//HR과제할 때 활용하기.