package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> {
	 void clean(T t);
}