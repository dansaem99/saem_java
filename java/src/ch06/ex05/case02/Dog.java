package ch06.ex05.case02;

public class Dog extends Animal {
	private int age;
	
	public Dog(int age) {
		super(age * 2);
		this.age = age;
	}
}
