package ch08.ex05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger = Logger.getLogger("ch08.ex05");
	}
	
	public void log() {
		logger.info("로깅을 시작합니다.");
		
		try {
			throw new Exception("일부로 발생했다.");
		} catch(Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("로깅을 끝냅니다.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}