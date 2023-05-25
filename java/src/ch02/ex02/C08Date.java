package ch02.ex02;

import java.time.LocalDate;

public class C08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1);
		date = date.minusDays(1);
		//날짜 연산
		System.out.println(date);
	}
}