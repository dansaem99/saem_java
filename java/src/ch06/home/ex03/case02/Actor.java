package ch06.home.ex03.case02;

public class Actor extends Entertainer {
	@Override
	public void play() {
		System.out.println("연기하다");
	}
}
//@Override 안붙여도 문제는 없지만 @Override를 써 줘야 
//컴파일러가 정말 @Override를 했는지 확인해 준다.