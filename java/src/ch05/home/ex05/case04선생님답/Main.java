package ch05.home.ex05.case04선생님답;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man(); //남자가 내 앞에 앉았다.
		//그가 자기 소개를 시작한다.
		man.setManName("최한석");//이름은 최한석
		man.setAge(33);//나이는 33세
		man.setBirthday(LocalDate.of(2025, 6, 7));//그의 생일이다.
		
		man.sing();//그는 노래를 부른다.
		man.eat();//그는 밥을 먹는다.
		man.run();//그는 달린다.
	}
}