package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		List<Ball> balls = new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			balls.add(slot.chuck());
			
		for(Ball ball: balls)
			System.out.print(ball);		
		}
	}
}
/* 
 * ch07.ex04.case03.Slot
 * List로, refactoring하라.
*/