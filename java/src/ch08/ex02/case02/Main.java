package ch08.ex02.case02;

public class Main {
	public static void main(String[] args) {
		Way way = Way.LEFT;
		String direction = "";
		
		direction = switch(way) {
		case LEFT -> "왼쪽";
		case RIGHT -> "오른쪽";
		default -> "";
		};
		
		System.out.println(direction);
	}
}