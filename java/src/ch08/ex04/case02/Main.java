package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		if(userId.length() > 9)
		throw new NumberException("숫자가 아닙니다.");
	}
}
/* throw는 Exception을 발생 시킬 우려가 있어 라는 것.
만약 발생 시킬거야 라고 쓴다면 트라이로 묶어줘야 한다.
*/