package ch08.ex03.case02;

import java.time.LocalDate;

public class Book {
	private final String title;
	private final int price;
	private final LocalDate printedDate;
	//레코드의 특징 한번 선언한 것은 바꿀 수 없다.(final)
	public Book(String title, int price, LocalDate printedDate) {
		this.title = title;
		this.price = price;
		this.printedDate = printedDate;
	}
	
	@Override
	public final String toString() {return null;}
	
	@Override
	public final int hashCode() {return 0;}
	
	@Override
	public final boolean equals(Object o) {return false;}
	
	public String title() {return null;}
	public int price() {return 0;}
	public LocalDate printedDate() {return null;}
}
//레코드 일반 클래스로 연출해본다.
