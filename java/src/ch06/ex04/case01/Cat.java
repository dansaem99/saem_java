package ch06.ex04.case01;

public class Cat extends Animal {
	private int age;
	
	public Cat(String catName, int age) {
		super(catName); //자식 클래스 생성자의 첫번째 자동 명령문이다. animal에 파라미터 없는 생성자를 call한다. 
		//this.animalName = catName; private이므로 컴파일 에러가 뜬다.
		this.age = age;
	}//super call하는 이유 = 맴버변수 초기화하기 위해서이다.
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
//생성자는 그저 생성자일 뿐 Cat 클래스는 Animal의 맴버와
//메소드를 상속 받는다. 생성자를 상속 받지는 않는다.
//자식 클래스 부모 클래스, 차일드 클래스 페런트 클래스,
//서브클래스 슈퍼클래스 