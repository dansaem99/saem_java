package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10; 
		int i = b;
		i = (int)b; 
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2;   //큰수 i를 b에 맞추니 overflow가 발생했다. 
		System.out.println(b2);  //300이 나와야 하는데 결과값이 다르게 나온다.
	}
}
