package dao.impl;

import org.springframework.stereotype.Component;

import dao.UserDao;
import entity.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		System.out.println(" 保存用户信息到数据库 ");
	}

}
