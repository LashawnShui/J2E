package cn.smbms.service;

import java.util.List;

import cn.smbms.pojo.User;

public interface UserService {
	/**
	 * ��ѯ�û��б�(�������������)
	 * @return
	 */
	public List<User> getUserList(User user);
	/**
	 * �����û�
	 * @param id
	 * @return
	 */
	public User getUser(Integer id);
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public int add(User user);
	/**
	 * �޸��û�
	 * @param user
	 */
	public void update(User user);
	/**
	 * ɾ���û�
	 * @param user
	 */
	public void delete(User user);
	
	/**
	 * �޸�����
	 * @param user
	 */
	public void changePwd(User user);
	
	
}
