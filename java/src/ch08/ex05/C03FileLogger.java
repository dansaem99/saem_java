package ch08.ex05;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
		//패키지명을 자동으로 뽑아내도록 쓴 것이다.
	}
	
	public void log() throws Exception {
		// throws 경고의 뜻도 있지만 남에게 Exception처리를 떠넘기는 역할도 한다.
		Handler handler = new FileHandler("c:/DEV/ch08.ex05.xml");
		//throws가 없으면 컴파일 에러가 발생한다.
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생했습니다.");
		logger.info("로깅을 마칩니다.");
		//메모리에 메세지가 저장된다.
		handler.flush(); //메모리에 있던 한번에 파일로 쏟아낸다.
		handler.close(); //다 썼으니까 지운다.
	}
	
	public static void main(String[] args) throws Exception {
		new C03FileLogger().log();
	} //vm이 떠넘김받는다. 
}
//객체는 메모리다.
//xml