package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		//심은 사람의 관점
		
		Tree tree = new Platanus();
		//행인의 관점
		platanus = (Platanus)tree;
		//행인이 심은 사람에게 어떤 나무인지 물어 보았다.
		
		tree = platanus;//promotion
		tree = (Tree)platanus;//casting
	}
}