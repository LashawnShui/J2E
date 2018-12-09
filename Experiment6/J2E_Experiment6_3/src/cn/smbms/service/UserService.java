package cn.smbms.service;

import java.util.List;

import cn.smbms.pojo.User;

public interface UserService {
	/**
	 * 查询用户列表(参数：对象入参)
	 * @return
	 */
	public List<User> getUserList(User user);
	/**
	 * 加载用户
	 * @param id
	 * @return
	 */
	public User getUser(Integer id);
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int add(User user);
	/**
	 * 修改用户
	 * @param user
	 */
	public void update(User user);
	/**
	 * 删除用户
	 * @param user
	 */
	public void delete(User user);
	
	/**
	 * 修改密码
	 * @param user
	 */
	public void changePwd(User user);
	
	
}
