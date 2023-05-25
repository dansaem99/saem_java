package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("헤롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		//모든 객체의 타입을 갖고 싶다. 할 때 Object 타입을 쓰면 된다.
		objs[0] = new Cat("헤롱이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
