package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		House house1 = new House();
		House house2 = null; //앞으로 집이 생길거야 라는 것을 표현한다.
		
		house1.setAddress("서울 강남구 역삼동");
		
		house2 = house1;
		System.out.println(house2.getAddress());
		
		//과제: house1의 키를 house2에 넘겨줬다.
	}
}