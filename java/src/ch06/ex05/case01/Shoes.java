package ch06.ex05.case01;

public class Shoes extends Product {
	public int price;
	
	public Shoes(int price) {
		super(price * 2);
		this.price = price;
	}
}