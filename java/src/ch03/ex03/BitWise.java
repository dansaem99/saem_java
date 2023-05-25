package ch03.ex03;

public class BitWise {
	public static void main(String[] args) {
		int x = 10;
		System.out.printf("%s, %d\n",
				"0000000000000000000000000000" + Integer.toBinaryString(x), x);
		
		x = ~x; //BitWise
		System.out.printf("%s, %d\n", Integer.toBinaryString(x), x);
	}
}
