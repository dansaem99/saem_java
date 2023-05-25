package ch06.ex06.case04;

public class Fridge implements Appliance {
	@Override
	public void on() {}
	
	@Override
	public void off() {}
}
//implements 구현하다 라는 의미이다.
//추상 매서드가 하나 이상 있는 상태에서는 일반 class가 될 수 없다. abstract class..
//해결책 중 하나가 abstract 이지만 목적에 위배되기 때문에 오버라이드 해준다.