package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
		
		for(int num = 0; num < cards.length; num++) 
			cards[num] = new Card(num); 
		
		for(Card num : cards) System.out.print(num + " ");
		System.out.println();
		
		for(int num = 0; num < 100; num++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			Card tmp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = tmp;
		}
		
		for(Card num: cards) System.out.print(num + " ");
	}
		
}
/*
과제 : ch07.ex04.case01.Shuffle을 객체지향으로 refactoring 하라.
셔플에 썼던 알고리즘은 메인에 구현.
*/