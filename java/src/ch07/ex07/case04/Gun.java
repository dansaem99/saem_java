package ch07.ex07.case04;

@FunctionalInterface
public interface Gun {
	void fire();
}
/* 실제 gun 객체를 만들지는 않을 거지만 
 * fire의 주어를 gun으로 준 것이다. 마치 gun타입의 객체에서
 * 나오는 것 처럼 느껴진다.*/
