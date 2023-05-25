package ch06.ex02.case02;

public class Parent {
	private String regNum;
	private String parentName;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}

	public String getParentName() {
		return parentName;
	}

	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;
		//setMoney가 있으면 원래 자산이 사라지는 꼴이 되므로 
		//+=로 누적되는 다른 알고리즘을 생성한다.
	}
}