package ch07.ex02.Presentation;

import ch07.ex02.Service.UserService;

public class UserIo {
	private UserService userService;
	//유저 서비스로 부터 데이터를 받는다.
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		Console.info(userService.getUser());
	}
}