package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 1, 1);
		LocalTime time = LocalTime.of(18, 7, 13);
		
		System.out.println(date);
		System.out.println(time);
		
		// println = toString이 호출되고 date를 이용해 가공한 string 값을 리턴한다.
	}
}