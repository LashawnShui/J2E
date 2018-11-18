package dao.impl;

import bean.User;
import dao.UserDao;

public class UserDaoImpl implements UserDao {

	public void save(User user) {
		System.out.println(" 保存用户信息到数据库 ");
	}

}
