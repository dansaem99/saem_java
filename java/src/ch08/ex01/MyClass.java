package ch08.ex01;

@Universal
@Type(name = "class", value = 1)
public class MyClass {
	@Field(1) @Universal
	//value = 1 < value는 기본 어트리뷰트 네임이다. 생략이 가능하다.
	private String myName;
	
	@Constructor
	public MyClass() {}
	
	@Method
	public void play(@Param String userName, @Param int age) {
		@Local int i = 0;
	}
}