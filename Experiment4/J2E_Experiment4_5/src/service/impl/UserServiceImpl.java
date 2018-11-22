package service.impl;

import dao.UserDao;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void addNewUser(User user) {
		dao.save(user);
		//产生一个异常
		int i = 0;
		i = i + 1/0;
	}

}
