package ch05.ex05.case09;

public class Cat {
	private String catName;
	
	public Cat breed() {
		return new Cat();
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}
}