package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// 앞쪽에 Integer을 썼기에 뒤쪽에 자동으로 들어가므로 생략해도 된다.
		list.add(1); //0 인덱스 //오토박싱이 되어 list로 들어간다.
		list.add(2); //1 CRUD중에 C Create를 의미한다.
		list.add(3); //2
		list.add(1); //3
		/*에드매서드를 사용하면 순서대로 벨류에 인덱스가 
		 * 자동으로 부여된다.
		 */
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0)); //0인덱스가 호출 된다.
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1);//CRUD의 D(Delete)
		System.out.println(list);
		//1에 있던 2가 사라지면서 인덱스 부모가 하나씩 위치이동 된다.
		
		//과제: list의 모든 원소를 삭제하라.
		//<방법 1>
		list.removeAll(list);
		//주어 list에서 목적어 list랑 똑같은 값들을 전부 없애버린 것이다.
		System.out.println(list);
		//<방법 2>
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
		for(int i = list.size() - 1; i >= 0; i--)//맨 끝에서 부터 지우면 자리 이동을 안한다.
			list.remove(i);
		System.out.println(list);
		//Arrays.asList 단독으로 쓰면 안된다.	
		//asList는 배열을 리스트로 바꿔준다.
	}
}
/* 배열의 단점을 보완한 문법으로 
 * 현장에서는 배열보다는 리스트를 많이 사용한다.
 * HR 과제에서도 해당 문법을 이용하면 된다.
 */

/* 배열은 배열의 크기 조절이 안되기 때문에 복사하고
붙여넣는 작업을 해야 한다. 리스트를 이용하게 되면
리스트 객체를 만들때 사이즈를 결정하지 않아도 된다.*/