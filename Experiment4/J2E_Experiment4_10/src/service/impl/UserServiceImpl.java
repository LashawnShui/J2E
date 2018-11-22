package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import bean.User;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDao dao;
	
	@Resource(name = "userDao")
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void addNewUser(User user) {
		dao.save(user);
	}

}
