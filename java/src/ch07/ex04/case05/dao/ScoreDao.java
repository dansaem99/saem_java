package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
		void insertScore(Score score); //C 점수하나를 가져오는
		Score[] selectScores(); //R 점수 들을 가져오는
}