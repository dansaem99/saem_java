package ch07.ex05.case05;

public class Main3 {

	public static void main(String[] args) {
		Floor floor1 = new Floor();
		Floor floor2 = new Floor();
		House house = new House();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("야옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		for(Floor floor : house)
			for(Cat cat : floor) cat.eat();
		//과제 : 고양이 6마리에게 밥을 먹여라.
	}
}