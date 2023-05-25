package ch03.ex02;

public class C02Not {
	public static void main(String[] arg) {
		boolean power = false; //전원이 꺼져있다를 boolean으로 표현한것이다. (두가지 변수만 가지고 있는 것이다.)flag variable
		power = !power;  //toggle
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}

//전원을 껏다 켰다.