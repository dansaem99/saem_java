package ch05.ex02.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMsg("행복한 하루를 시작합니다.");
		board.setWrittenDate(LocalDate.now());
	
		board.setMsg("재밌는 경기를 보러 가요.");
		board.setWrittenDate(LocalDate.now());
		
		System.out.printf("%s, %s\n", board.getMsg(), board.getWrittenDate());
		
	}
}