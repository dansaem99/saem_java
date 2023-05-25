package ch04.ex05;

public class C04_369 {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			System.out.print(" " + i);
			if(i % 3 == 0) System.out.print("짝");
		}
	}
}