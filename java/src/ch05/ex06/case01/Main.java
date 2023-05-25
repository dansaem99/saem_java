package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");
		//Man.tell(""); 인스턴스 메서드가 필요하다.
		//메세지 자체가 말 되고 있다. 주어에는 관심이 없다.
		
		Man man = new Man();
		man.tell("I LOVE JAVA");
		man.say("Hello.");
		//남자가 말하고 있다.
	}
}
