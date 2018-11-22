package dao.impl;

import org.springframework.stereotype.Component;

import bean.User;
import dao.UserDao;

@Component("userDao")
public class UserDaoImpl implements UserDao {

	public void save(User user) {
		System.out.println(" 保存用户信息到数据库 ");
	}

}
