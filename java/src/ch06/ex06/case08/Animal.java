package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() { }
}
/*default 메소드는 추상명사가 아니라고 표현한 것이다. 
 * 이는 interface내에서 알고리즘을 아는 메소드를 쓸 때 사용한다.
 */
