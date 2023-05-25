package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		//static 변수가 이미 존재하므로 진행 가능하다.
		
		//Card.kind;
		//Card.number; instance variable
		//객체가 존재하지 않기 떄문에 쓸 수 없다.
		
		Card card1 = new Card();
		Card card2 = new Card();   
		//이렇게 해주면 kind2개 존재 number2개 존재한다.
		//이때는 카드의 2개가 존재한다는 것만 알 수 있다.
		
		card1.kind = "heart";
		card1.number = 7;
		//카드의 앞면을 비로소 보았다.
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		//이렇게 쓰면 노란줄이 뜬다. 즉 유지보수에 힘들 우려가 있다.
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height);
		//static variable을 쓸때 class.을 붙여준다.
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
		/* static variable을 쓰면 편하긴 하지만 
		 * 공유하면서 데이터가 더러워지고 버그가 발생해서 
		 * 업무가 꼬여버릴 우려가 있다. 사용하려면 변질되지 않도록
		 * 알고리즘을 만들어야 한다. 이런 알고리즘을 lock quete라고 하는데
		 * 추후 오라클을 배우면서 잘 활용할 수 있다.
		 */
	}
}