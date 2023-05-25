package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		//<키, 벨류>
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);
		
		User user = map.get(1); //겟은 조회할 때 사용한다.
		System.out.println(user);
		System.out.println(map);
		
		user = map.remove(1);
		System.out.println(user);
		System.out.println(map);
		//키를 이용해서 꺼낸다.
	}
}

//맵에서는 키를 내가 조정해 주어야 한다. 