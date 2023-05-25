package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Friend {
	public void play() {
		Parent parent = new Parent();
		
		// parent.getRegNum();
		parent.getParentName();//public 
		//parent.getMoney(); protexted 
		//parent.addMoney(1000); default
	}
}
//먼 친구