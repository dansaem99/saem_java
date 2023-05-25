package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
	
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;	
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
	
		// iterating null의 값을 차례대로 읽어냄 
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		System.out.println();
		
		//collection ints 데이터가 집합되어 있는 객체를 의미한다.
		//왼쪽엔 원소를 담을 타입을 두고 오른쪽엔 콜렉션을 둔다.
		for(int i: ints) System.out.print(i + " ");
		//for each라는 문법이다. 만약 이 시간이후로 iterating 할 일이 있으면
		//for each 사용을 권장한다.
		
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}