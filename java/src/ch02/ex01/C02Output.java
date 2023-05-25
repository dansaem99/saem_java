package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); //()공간을 parameter라고 한다.
		//100이라는 숫자가 저장 된 공간이 constant
		System.out.println(score);
		System.out.println(100 + 1); 
		/*수식 계산식 expression 표현한다는 의미이다. 
		 * 100 + 1은 101을 표헌하는 것이다.*/
		System.out.println(Math.random()); 
		//method name에 parameter을 주는 것을 method call이라고 부른다.
		/*return vallue 가 있고 없고의 차이 0.0이상 1.0미만의 값을
		 * ramdom하게 return한다.*/
		//궁금할 때는 hover후 f2를 눌러주면 된다.
		
		System.out.print(200);
		System.out.print(300);
		//값들을 한줄로 표현하고 싶다면 print를 쓰면 된다.
		System.out.print('\n'); //singlequote는 char데이터이다.
		//줄바꿈은 print의 기능이지 \n이 줄바꿈 문자는 아니다.
		//\n은 키보드의 enter를 눌렀을때 입력되는 문자를 표현한다.
		//doublequote로 묶으면 string 타입의 데이터이다.
		System.out.print(400);
		//가끔 줄 바꿈 하고 싶다면 위와 같이 하면 된다.
		System.out.println();
		//println은 \n을 자동 추가 해주는 것이다.
		
		System.out.printf("%b %c %d %f %s\n",true,'a', 10, 1.15,"hello");
		//seperator
		//parameter을 n개 쓸 수 있게 된다.
		//첫번째 줄에는 늘 string을 쓰는데 양식을 정해주는 것이다.
		//%b(boolean타입을 의미한다) %c(char)
		//~~~~출력한 후에 줄바꿈 까지 한다 하고 양식을 정한 것이다.
		//오른쪽엔 양식에 맞춰 데이타를 나열하면 된다.
		
		//과제 : 위 출력문에서 구분자로 / 를 사용하라.
		
		System.out.printf("%b/%c/%d/%f/%s\n",true,'a', 10, 1.15, "hello");

		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		//%가 안 붙은 문자들은 그대로 출력된다.
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다."); // snippet
		//수식에 참여하고 있는 연산을 당하는 값을 피연산자라고 한다.
		//피 연산자가 숫자면 더하기 하나라도 문자이면 붙이기(concatenate)이다.
	}
}