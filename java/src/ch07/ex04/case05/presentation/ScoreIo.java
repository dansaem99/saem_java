package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	/*String kor = "";
	String eng = "";
	String math = "";
	boolean isGood = false;
	boolean isGood2 = false;
	*/
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	//과제: 5명의 국,영,수 점수를 user가 입력토록 하라.
	//interface Console을 만든다.
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
			scoreService.addScore(new Score(kor, eng, math));
		}
		
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
		
	/*	Score[] scores = new Score[5];
		

		do {
			isGood = kor.matches("^[1-9][0-9]+");
			isGood2 = kor.matches("[0]");
		for(int i = 0; i < scores.length; i++)
			scoreService.addScore(
					new Score(kor = Console.inInt((i + 1) + "번 학생의 국어점수를 입력하세요."), 
					eng = Console.inInt((i + 1) + "번 학생의 영어점수를 입력하세요."), 
					math = Console.inInt((i + 1) + "번 학생의 수학점수를 입력하세요.")));
		}while(!isGood || isGood2);
	
		scores = scoreService.getScores();
		for(Score score: scores)
			System.out.println(score);
			*/
	}
}

//trade off : +가 있으면 -가 있다. 하나를 해결하면 다른것에 문제가 발생하는 상황을 의미한다.