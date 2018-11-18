package service.impl;

import dao.UserDao;
import bean.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao dao;
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void addNewUser(User user) {
		dao.save(user);
	}

}
