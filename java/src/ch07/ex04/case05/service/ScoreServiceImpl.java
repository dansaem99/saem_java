package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl() {}
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		//return ScoreDao.selectScores();
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	
	//과제: 학생별 합계, 평균 필드를 채워라.
	private void calcScore(Score[] scores) {	
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(
					scores[i].getKor() +
					scores[i].getEng() +
					scores[i].getMath());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
}	

/* 서비스는 dao를 디펜던시로 갖는다.
이를 테스트 하기 위해서는 dao로 부터 받을 법한 데이터를 수동으로
준비해 준다 (fixture)*/