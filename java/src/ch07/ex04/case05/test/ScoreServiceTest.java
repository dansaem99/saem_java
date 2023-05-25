package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class ScoreServiceTest {
	public static void main(String[] args) {
		ScoreServiceImpl scoreService = new ScoreServiceImpl();
		
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i + 1) * 10, (i + 1) * 10, (i + 1) * 10);
		
		//scoreService.calcScores(scores);
		for(Score score: scores) System.out.println(score);
	}
}
/* 서비스는 dao를 디펜던시로 갖는다.
이를 테스트 하기 위해서는 dao로 부터 받을 법한 데이터를 수동으로
준비해 준다 (fixture)*/