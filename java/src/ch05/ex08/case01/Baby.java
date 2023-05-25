package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {} //기본생성자
	
	public Baby(String babyName) {
		this.babyName = babyName;
	}//객체 생성직후 맴버변수 값을 write하고 싶은 것.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}//객체 생성된 후에 맴버범수 값을 write하는것. 
}