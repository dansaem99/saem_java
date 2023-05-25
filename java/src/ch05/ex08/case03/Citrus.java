package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";
		this("레드향"); //this = Citrus생성자
	}//뭔가 생성 하나라도 쓰면 기본생성자 자동으로 안써진다.
	//따자 마자 이미 레드향인 상태이다. 현장에서 잘 안쓴다.
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}//객체 생성하자 마자 쓰려고 만든 것이다.
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}//객체 생성한 후에 쓰려고 만든 것이다.
}