package ch07.ex06.case07;

import java.util.ArrayList;

public class Container<E> extends ArrayList<E> {
	public void contain(E thing) {
		this.add(thing);
	}
}
