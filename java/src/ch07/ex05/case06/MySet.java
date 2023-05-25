package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void mian(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		//중복된 Value라는 것이 없다.
		
		System.out.println(set);
		//중복된 내용이 없다.
		
	}
}
