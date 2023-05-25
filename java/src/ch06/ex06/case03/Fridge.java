package ch06.ex06.case03;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	@Override
	public void off() {}
}
/* on은 일반 메소드여서 그대로 상속받고 
 * off는 추상 매소드여서 Override 해 준 것이다
 */
