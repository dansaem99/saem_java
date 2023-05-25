package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		//쓰레드 1개인 경우 0이 나온다. 언제 찍든 늘 0이어야 한다.
		new Player(counter).start();
		new Player(counter).start();
		//난리가 난다. 이때 락을 걸어주면 난리를 해결 할 수 있다.
	}
}
//1이 나오는 것은 VM 마음이다.
/*" 나는 게임을 잘한다." play게임은 런이다. 그런데 런을 가지고 있다 해서 
지금 당장 게임을 안하고 있다. 게임을 하도록 시작 시키는게 start다. 
*/