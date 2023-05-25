package ch07.ex04.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		//동물로서의 관점 고양이도 뱀도 다 가져올 수 있다.
		
		animals[0] = new Cat();
		animals[1] = new Snake();
		animals[2] = new Snake();
		
		for(Animal animal : animals)
			animal.eat();
	}
}


//generic type(아무거나 타입)
/* 클래스, 인터페이스, 메서드를 사용할 때 */