package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10]; //Exception 처리를 catch로 떠넘긴다.
		} catch (ArrayIndexOutOfBoundsException e) {
			//내가 처리하고 싶은 Type을 위에 적어준다. 이 타입을 벗어나면
			//버츄얼 머신이 처리한다.		
			System.out.println("error.");
		}
		
		System.out.println("end.");
	}
}

/*
 * 앱에 Exception이 발생해도 앱이 꺼지면 안되기 때문에 
 * try와 catch를 이용해서 앱을 살려낸다.
 */

/* exeption이 발생할 가능성 있는 코드를 try로 감싼다. 만약
exception이 발생하지 않으면 괜찮은 것이고, 그렇지 않으면
이에 대해 대처를 해 주어야 한다. 그 사건의 이름을
클래스 명으로 해서 객체를 만들어 주며 해당 객체를 e(event)에
집어넣어 준다. 만약 해당 객체에 e가 들어왔다. 그러면 설정한
에러가 발생하고, 앱이 죽지 않게 된다.*/
