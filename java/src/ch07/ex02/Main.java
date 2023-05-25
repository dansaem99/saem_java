package ch07.ex02;

import ch07.ex02.Presentation.Console;
import ch07.ex02.Presentation.UserIo;
import ch07.ex02.Service.UserService;
import ch07.ex02.Service.UserServiceImpl;
import ch07.ex02.dao.UserDao;
import ch07.ex02.dao.UserDaoImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		Console.info("start.");
		userIo.play();
		Console.info("end.");
	}
}
//앱은 객체의 집합이다.