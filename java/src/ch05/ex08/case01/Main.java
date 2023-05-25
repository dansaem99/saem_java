package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.setBabyName("초롱이");
		//태어난 후에 이름을 받은 것
		
		baby = new Baby("튼튼이");
		//태어날때 이미 튼튼이라는 이름을 가지고 있는 것
	}
}