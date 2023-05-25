package ch07.ex05.case01;

public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
/*
 * <> 다이아몬드 안에다가 내가 원하는 제네릭 타입을 적어주면
 * 자유롭게 사용할 수 있다. 제네릭 타입은 메인에서 new할때
 * 결정이 되게 된다.*/