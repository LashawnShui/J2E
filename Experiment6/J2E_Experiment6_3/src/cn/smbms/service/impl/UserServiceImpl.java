package cn.smbms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		userMapper.delete(user);
	}

	@Override
	public void changePwd(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.getUser(id);
	}

}
