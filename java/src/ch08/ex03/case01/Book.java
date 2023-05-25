package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

public record Book(String title, int price, LocalDate printedDate) {
	public Book {
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
	} //필드값이 필수다 라는 의미를 준다.
}