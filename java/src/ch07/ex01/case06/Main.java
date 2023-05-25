package ch07.ex01.case06;

public class Main {
	public static void main(String[] args) {
		Human human = new Student();
		human.sleep();
		//human.study();
		
		Student student = (Student)human;
		student.study();
		student.sleep();
	}
}