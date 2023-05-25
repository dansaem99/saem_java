package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		Janitor<Building> janitor1 = building -> System.out.println(building + " 청소하다");
		Janitor<Car> janitor2 = car -> System.out.println(car + " 청소하다");
		
		janitor1.clean(new Building());
		janitor2.clean(new Car());
	}
}

/*building(그냥 이런 변수가 있어) -> System.out.println(building + " 청소하다"); 
 * clean 이라는 메소드이다.
 */