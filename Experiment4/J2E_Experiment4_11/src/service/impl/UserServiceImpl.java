package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;
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
		//产生一个异常
		int i = 0;
		i = i + 1/0;
	}

}
