package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		System.out.printf("%s %d\n", name, ordinal);//RIGHT 1
		
		Way[] ways = Way.values();
		//이넘안에 있는 요소들 entry들을 뽑아 낼 수 있다.
		for(Way way : ways) System.out.print(way + " ");//LEFT RIGHT
		System.out.println();
		//출력 된 것은 코드 네임이다.
		Way way = Way.valueOf("LEFT");
		System.out.println(way);
	}
}