package ch08.ex05;

import java.util.logging.Logger;

public class C01MyLogger {
	public static void main(String[] args) {
		Logger.getGlobal().info("hello");
	}
}
//MyLogger 유지보수하고 싶다면 해당 파일을 찾아 가면 된다.