package ch05.ex09.case02;

public class Phone {
	private static int cnt; //공유 되어야 하기 때문에 static
	private int serial;//시리얼 넘버는 공유 필요 없음.
	
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {} //일단 넣고 필요 없으면 지워라.
	
	public Phone(int serial) {
		this.serial = serial;
	} //생산자 오버로딩

	public int getSerial() {
		return this.serial;
	}
}