package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		int val = 1;
		
		switch(val) {
		case 1 -> val++; //노동자를 추가할때
		case 2 -> val--; //노동자를 삭제할떄
		}
		
		switch(val) {
		case Code.USER_ADD -> val++;
		case Code.USER_DEL -> val--;
		}//유지보수 노동자가 코드 파악하기 용이하다.
		
		System.out.println(val);
	}
}


//hr 과제에 활용하기.(노동자 추가 삭제)