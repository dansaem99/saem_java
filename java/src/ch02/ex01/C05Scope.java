package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0;
		int j = 0;
		{
			//int i = 0; 중복이 된다.
			int x = 0;
			int y = 0;
		}
		int x = 0; //lifecycle 프로그램은 위에서 부터 아래로 시작된다. 
		//x변수는 12번 째 줄에서 이미 죽은 상태이다. 따라서 중복 되지 않는다.
	}
}

/*{}의 안쪽이 Scope(변수의 공간)이다. 
 * 변수는 스콥 내에서 만 살아있기에 중복될 수 없다.
 */

//javaw.exe(virtual machine이 태어나고) C05Scope(loading 하고) 매서드를 call한다.