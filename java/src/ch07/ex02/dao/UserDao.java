package ch07.ex02.dao;

import ch07.ex02.domain.User;

public interface UserDao {
	public User selectUser();
	//read = select로 약속했다. 
}
//UserDao 유저 데이터를 다루는 dao