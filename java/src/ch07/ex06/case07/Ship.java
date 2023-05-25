package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private List<Container<?>> containers;
	//컨테이너가 원소인 리스트를 가질 수 있다.
	
	public Ship() {
		containers = new ArrayList<>();
	} //배에 컨테이너 실을 자리를 마련한다.
	
	public void put(Container<?> container) {
		this.containers.add(container);
		//원소 타입고 일치하는 컨테이너 와일드카드이다.
	}
}
