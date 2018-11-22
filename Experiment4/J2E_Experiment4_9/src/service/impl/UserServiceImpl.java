package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import bean.User;
import service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")
	private UserDao dao;

	public void addNewUser(User user) {
		dao.save(user);
	}

}
