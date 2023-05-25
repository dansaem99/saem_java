package ch06.ex06.case05;

import ch06.ex06.case04.Appliance;

public class Fridge implements Appliance, Electronic {
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
}
//implements 뒤에 interface n개를 줄 수 있다.
