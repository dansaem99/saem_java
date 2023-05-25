package ch07.ex06.case06;

import java.util.List;

public class Pocket {
	{
		int i = 1 + 2;
		double d = 1.0 + 2.0;
		//new Number(1) + new Number(2);
	}
	
	//unbounded wildcard
	public void printList(List<?> list) {
		System.out.println(list);	
	}
	//제네릭은 내가 디자인 할 때 쓰고 와일드는 내가 use할 때 쓴다.
	//upper bounded wildcard
	public double add(List<? extends Number> list) {
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();
		
		return sum;
	}
}

//제네릭 타입을 사용할 때 조차도 타입을 주고 싶지 않을 때 사용한다.