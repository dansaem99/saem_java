package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		//human.walk(); static 메소드라 사용이 안된다.
		Human.walk();
		human.sleep(); //default메소드는 객체. 하고 사용한다.
		
		human = new Student();
		human.say();
		human.sleep();
	}
}