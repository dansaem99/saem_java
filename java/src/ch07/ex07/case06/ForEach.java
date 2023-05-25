package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 3; i++) list.add(i);
	
		list.forEach(x -> System.out.print(x + " "));
		System.out.println();
		//forEach가 람다를 받는 경우이다.
		
		//과제: list에서 짝수들만을 출력하라.
		
		list.forEach(x -> {
		 	if(x % 2 == 0) System.out.print(x);
		 	//자바 스크립트에서 아주아주 많이 쓴다.
		});
	}
}
