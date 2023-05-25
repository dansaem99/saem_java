package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
/*interface 는 instance variable을 만들 수 없기 때문에 
 * static variable 만 만들 수 있다.
 */
//VOLTAGE(코드네임) = 200(코드벨류);
//public static final은 생략 가능하다.(자동으로 붙어있다)

/* 생성자가 없으니 맴버변수선언과 동시에 초기화 한다.*/