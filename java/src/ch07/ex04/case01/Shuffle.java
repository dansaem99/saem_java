package ch07.ex04.case01;

public class Shuffle {
	public static void main(String[] args) {
		int[] cards = new int[5];
		
		for(int i = 0; i < cards.length; i++) cards[i] = i;
		
		for(int i : cards) System.out.print(i + " ");
		System.out.println();
		
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4) + 1;
			
			int tmp = cards[0]; //0번째 카드를
			cards[0] = cards[idx]; // 임의의 카드와 바꾸는 작업
			cards[idx] = tmp;
		}
		
		for(int i: cards) System.out.print(i + " ");
	}
}
//카드 랜덤 셔플