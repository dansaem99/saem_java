package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		if(way == Way.LEFT) direction = "왼쪽";
		else direction = "오른쪽";
		
		System.out.println(direction);
	}
}
