package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.println(dog.getAge()); //2 애니멀의 age
	}
}