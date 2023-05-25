package ch07.ex04.case02;

public class Cat {
	private String catName;
	
	public Cat(String catName) {
		this.catName = catName;
	}
	
	@Override
	public String toString() {
		return this.catName;
	}
}