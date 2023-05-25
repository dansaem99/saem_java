package ch07.ex03.service;

import ch07.ex03.domain.User;

public interface UserService {
	public User getUser();//read
	public void addUser(User user);
	public void fixUser(String userName);
	public void delUser();
}