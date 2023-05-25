package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		
	Player player1 = new Player();
	Player player2 = new Player();
	Player player3 = new Player();
	Ball ball = new Ball();
	
	player1.setPlayerName("최한석");
	player2.setPlayerName("한아름");
	player3.setPlayerName("양승일");
	
	player3.kick(player2.pass(player1.pass(ball)));
	}
}
	
/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.
*/