package ch07.ex03;

import ch07.ex03.dao.UserDao;
import ch07.ex03.dao.UserDaoImpl;
import ch07.ex03.presentation.Console;
import ch07.ex03.presentation.UserIo;
import ch07.ex03.service.UserService;
import ch07.ex03.service.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
	
		userIo.play();
		Console.info("end.");
	}
}
//객체는 맴버변수(데이터)의 집합이다.
//injaction의 방법은 세터를 이용한다. 생산자를 이용한다 두가지이다.