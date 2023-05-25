package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//컴파일 에러 발생 basket.set(new Grape());
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}

