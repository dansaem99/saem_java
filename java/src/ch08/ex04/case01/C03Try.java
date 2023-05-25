package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			//a.txt를 만드는 것은 윈도우즈가 하는 일이다. 
			for(int i : arr) out.println("arr[" + i + "]: " + arr[i]);
			//이 객체는 콘솔이 아닌 파일에 출력이 된다.
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			if(out != null) out.close();
		}
		/* cpu 실행시간, 메모리 사용용량이 많으면 비싸다고 한다.
		 * 비용이 많이 드니까 업무 끝났으면 객체를 빨리 없애려고 하는 것이다 .
		 */
		
		System.out.println("end.");
	}
}
//try catch 는 서로 배타적이다 하나만 실행된다.
/*catch 블럭은 n개 사용할 수 있다. 서로 간에 배타적이며
try 블럭에 catch 블럭에 있는 명령문은 실행 될 수도 있도 안될 수 도 있지만
finally의 경우 반드시 실행된다.*/ 