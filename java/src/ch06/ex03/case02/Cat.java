package ch06.ex03.case02;

public class Cat extends Animal {
	@Override //annotation(주석)
	public void shout() {
		System.out.println("야옹야옹");
	}
}
//Oerride (재정의) 한다고 했으면서 shout2가 되면 컴파일 에러가 발생한다.
//메소드 바디를 바꿔치기한다. 알고리즘이 마음에 안들 때