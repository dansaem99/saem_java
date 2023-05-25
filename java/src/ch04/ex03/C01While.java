package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 80;
		int jumpCnt = 0;
		
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		
		System.out.printf("%d번 줄넘기해서, 몸무게 %dkg이 되었습니다.", jumpCnt, weight);
	}
}