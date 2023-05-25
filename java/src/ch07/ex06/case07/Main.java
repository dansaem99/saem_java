package ch07.ex06.case07;

public class Main {
	public static void main(String[] args) {
		Ship ship = new Ship();
		Container<Cow> container1 = new Container<>();
		Container<Car> container2 = new Container<>();
		
		ship.put(container1);
		ship.put(container2);
	}
}