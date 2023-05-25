package ch07.ex04.case06;

public class Dog implements Animal {
	private String dogName;
	
	public Dog(String dogName) {
		this.dogName = dogName;
	}
	
	@Override
	public String toString() {
		return this.dogName;
	}
}