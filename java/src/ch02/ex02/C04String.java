package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";
		//.trim()을 이용하면 유저가 실수로 잘못
		//스페이스를 입력해도 스페이스를 무시하고 
		//잘 처리할 수 있다.
		s = s.concat(" dog");
		//s를 주어 parameter을 목적어라고 치면
		//주어에 목적어를 붙이는 일을 한다.
		s = s.substring(2);
		//글자 앞부터 0인덱스라고 한다. 지정한
		//인덱스 이하만 리턴한다는 의미이다. Str
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		//1인덱스인 e만 뜯어냈다. 문자를 뜯어낼땐
		//charAt()을 쓰면 된다. char
		
		int i = "apple".codePointAt(0);
		//해당 인덱스 글자인 p의 유니코드를 리턴한다.
		i = "a".hashCode();//hashcode가 유니코드의 해시코드(주소값)를 불러온다. 
		i = "b".hashCode();
		i = "b".compareTo("a");//compareTo앞 뒤 비교해서 크면 양수 작으면 음수
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a"); //논리적인 값만 비교한다.
		i = s.indexOf("l");
		//l의 index를 알고 싶다.
		//l이 2개인 경우 첫번째 l의 인덱스를 리턴한다.
		i = s.lastIndexOf("l");
		//마지막 인덱스를 알고 싶다.
		i = s.length();//문자의 개수를 리턴한다.
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		//b에게 boolean 타입을 부여 아래부터는 
		//부여하지 않아도 됨.
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();//앞의 값이 empty string인지 보게 된다.
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]*");
		System.out.println(b);
	}
}

/* a의 유니코드= 97
A의 유니코드= 65
0의 유니코드 = 48 */

