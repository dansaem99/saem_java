package ch07.ex02.Service;

import ch07.ex02.dao.UserDao;
import ch07.ex02.domain.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	} //DI : (Dependancy Injection) Dao 를 서비스 안에 집어 넣는 것 두가지 부품을 연결시킨다.
	
	@Override
	public User getUser() {
		return userDao.selectUser();
	}
}
/* 
 * UserDao userDao; 이렇게 쓰는 이유 
 * 인터페이스를 먼저 만들어 두었기 때문에
 * 추후 유지보수 할 때 userDaoImpl2 를 만들어서 대체하고
 * 문제가 생기면 바로 이전것으로 바꿀 수 있게 된다.
 */
