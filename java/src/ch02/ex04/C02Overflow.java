package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; //overflow
		byte b = 127;   //01111111 = 127
		//b = b + 1;  //오류가 발생한다.
		
		b++;  //b에서 값을 read하고 더하기 1을 하고 그 결과값을 다시 write하라.
		//=> 결과값이 -128이 된다. 10000000 = -128 최대값에서 1 더하니 최소값이 되었다.
		b++; //-128에서 1더하면 -127이 된다.
		System.out.println(b);
	}
}