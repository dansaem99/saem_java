package ch06.ex06.case06;

import ch06.ex06.case04.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic  {

}
/*interface가 상속 받을 땐 extends를 쓴 후 n개 지정해 준다.
extends 뒤에 클래스가 오면 1개만 올 수 있다.*/