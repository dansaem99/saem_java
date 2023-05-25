package ch07.ex03.presentation;

import ch07.ex03.domain.User;
import ch07.ex03.service.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void play() {
		String userName = Console.inStr("추가할 회원명을 입력하세요.");
		userService.addUser(new User(userName));
		Console.info(userService.getUser() + "을 추가했습니다.");
		//unitest단위테스트 //통합테스트
		
		userName = Console.inStr("수정할 회원명을 입력하세요.");
		userService.fixUser(userName);
		Console.info(userService.getUser() + "을 수정했습니다.");
		
		userService.delUser();
		Console.info("회원을 삭제했습니다.");
	}
}