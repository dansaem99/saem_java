package ch07.ex04.case05.domain;

public class Score {
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
	
	public int getSum() {
		return this.sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return String.format("%5d %5d %5d %4d %4d",
				kor, eng, math, sum, avg);
	}
}