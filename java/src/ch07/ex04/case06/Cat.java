package ch07.ex04.case06;

public class Cat extends Object implements Animal {
	private String catName;
	
	public Cat(String catName) {
		this.catName = catName;
	}
	
	@Override
	public String toString() {
		return this.catName;
	}
}