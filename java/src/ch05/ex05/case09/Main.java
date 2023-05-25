package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setCatName("늠름이");
		
		Cat cat2 = cat1.breed();
		cat2.setCatName("튼튼이");
		
		System.out.printf("%s\n%s\n", cat1, cat2);
		System.out.printf("%s\n%s", cat1.getCatName(), cat2.getCatName());
	}
}