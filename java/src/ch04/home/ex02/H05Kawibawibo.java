package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int you = 0;
		int me = (int)(Math.random() * 3) + 1;
		String result = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n");
		you = sc.nextInt();
		
		String kawibawibo = switch(you) {
		case 1 ->  "가위";
		case 2 ->  "바위";
		case 3 ->  "보";
		default -> "repaly";
		};
		
		System.out.printf("You: %s\n", kawibawibo);
		
		kawibawibo = switch(me) {
		case 1 ->  "가위";
		case 2 ->  "바위";
		case 3 ->  "보";
		default -> "repaly";
		};
		System.out.printf("Me: %s\n\n", kawibawibo);
		
		if(0 > you || you > 3) result = "replay.";
		else if(you == me) result = "Fair.";
		else if(you == me - 1 || you == me -3) result = "You lose.";
		else result = "You win.";
		System.out.println(result);
	}
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중 하나이다.
--

1.가위, 2.바위, 3.보
> 1
You: 가위
Me: 보

You win.
*/