package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Man {
	private String manName;
	private int age;
	private LocalDate birthday;
	
	public void seat() {}
	public void introduce() {}
	public void wait_the_food() {}
	public void sing() {}
	public void eat() {}
	public void runaway() {}
	
	public void setManName(String manName) {
		this.manName = manName;
	}
	
	public void setAge(int Age) {
		this.age = Age;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
/*
남자 객체만을 calss로 디자인하라.
--

식당에서 한 남자가 다가와 앉습니다.
남자가 자기 소개를 합니다.
이름은 최한석, 나이는 33살, 생일은 2025-6-7 입니다.

남자는 음식을 기다리는 동안, 노래를 부릅니다.
음식이 나오니까 맛있게 먹습니다.
다 먹더니, 계산을 안 하고, 달려 나갑니다. 
*/
