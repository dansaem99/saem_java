package ch05.home.ex06.case02선생님답;

public class Main {
	public static void main(String[] args) {
		Console.inStr("문자를 입력하세요.");
		Console.inNum("자연수를 입력하세요.");
		Console.info("끝.");
	}
}
/*
과제: ch05.ex06.case02.Console을 고도화 하라.
Console.inStr():한글자 이상 입력한다.
Console.inNum():한자리 자연수를 입력한다.
--

문자를 입력하세요.
>//엔터
ERROR] 한글자 이상 입력하세요.
>hello
숫자를 입력하세요.
>//엔터
ERROR] 
숫자를 입력하세요.
>12
ERROR] 한자리 자연수를 입력하세요.
>1
끝.
*/