package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		
		human.eat(new Ramen());
		human.eat(new Kimchi());
		human.eat(new Apple());
	}
}

//앞으로 개발할 때 변수의 타입은 인터페이스로 두는 게 낫다.