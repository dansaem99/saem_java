package ch07.ex06.case05;

public class Cabinet<T extends A > {
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	//제약을 할 수 있다. A이하 아무거나
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	} //제약을 할 수 있다. C이하 아무거나
}