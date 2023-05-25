package ch07.ex01.case08;

public class Clerk {
	public Flower sell(String flowerName) {
		Flower flower = switch(flowerName) {
		case "백합" -> new Lily();
		case "장미" -> new Rose();
		default -> null;
		};
		
		return flower;
	}
}
