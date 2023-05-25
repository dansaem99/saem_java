package ch05.home.ex05.case08선생님답;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		player1.setPlayerName("최한석");
		player2.setPlayerName("한아름");
		player3.setPlayerName("양승일");
		
		player3.kick(player2.pass(player1.pass(ball)));
	}
}