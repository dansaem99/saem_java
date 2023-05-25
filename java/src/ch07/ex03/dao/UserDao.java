package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser();//read
	public void insertUser(User user);//유저데이터 추가한다
	public void updateUser(String userName);//유저데이터 한다
	public void deleteUser();//유저데이터 삭제한다
}