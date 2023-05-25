package ch07.ex06.case02;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Tiger());
		zoo.add(new Falcon());
		
		zoo.clear(); 
		//초기화 
		zoo.add(Cosmos.getAnimal("호랑이"));
		zoo.add(Cosmos.getAnimal("매"));
		
		for(Animal animal: zoo) {
			animal.eat();
			animal.move();
		}
	}
}
