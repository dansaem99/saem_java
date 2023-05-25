package ch02.ex02;

public class C05String {
	public static void main(String[] args) {
		//text block
		String comment = """
				이 식당에 방문하길 잘 했네요.
				"참 맛있다."
				라는 말이 절로 나오네요.
				""";
				//html pre태그랑 비슷한 기능을 한다.
		System.out.println(comment);
		
		String color = """
				red
				green
				blue
				""";
		System.out.println(color);
		
		color = """
				red  \s
				green\s
				blue \s
				""";
		System.out.println(color);     // \s로 위치 조정을 해 width를 통일 시켰다.
		
		String type = "int";
		String code = """
			    public void print(""" + type + """
				 val)
				 System.out.println(val);
				)""";
		System.out.println(code);
		
		code = """
				<html>
					<body>
						<p>Hello, Java</p>
					</body>
				<html>    """;
		System.out.println("|" + code + "|");
	}
}
