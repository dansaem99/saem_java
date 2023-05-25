package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		};
		System.out.println(msg);
		
		// yield: keyword가 아니다. restricted identifier(제한자) 이다.
		int yield = 1;//컴파일러 에러가 안난다.
		System.out.println(yield);
		//int switch = 1;
	}
}