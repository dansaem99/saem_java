package ch07.home.ex04.case02선생님답;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
		
		for(int i = 0; i < cards.length; i++) 
			cards[i] = new Card(i);
		
		for(Card card: cards) System.out.print(card);
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			//1 부터 4까지의 정수
			Card tmp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = tmp;
		}
		
		for(Card card: cards) System.out.print(card);
	}
}

/*
과제 : ch07.ex04.case01.Shuffle을 객체지향으로 refactoring 하라.
셔플에 썼던 알고리즘은 메인에 구현.
*/