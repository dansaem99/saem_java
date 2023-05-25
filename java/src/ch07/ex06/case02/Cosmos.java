package ch07.ex06.case02;

public class Cosmos {
	public static Animal getAnimal(String animalName) {
		return switch(animalName) {
		case "호랑이" -> new Tiger();
		case "매" -> new Falcon();
		default -> null;
		};
	}
}
/*
 * 객체를 만드는 새로운 방법 > 우주에게 요청해서 새로운
 * 객체를 생성한다. 펙토링 메소드
 */