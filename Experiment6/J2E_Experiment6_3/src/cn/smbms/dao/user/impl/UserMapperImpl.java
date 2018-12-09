package cn.smbms.dao.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
///仅在使用SqlSessionTemplate时使用映射器的实现类。
public class UserMapperImpl implements UserMapper {

	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return this.sqlSessionTemplate.getMapper(UserMapper.class).getUserList(user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return this.sqlSessionTemplate.getMapper(UserMapper.class).add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.sqlSessionTemplate.getMapper(UserMapper.class).update(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.sqlSessionTemplate.getMapper(UserMapper.class).delete(user);
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return this.sqlSessionTemplate.getMapper(UserMapper.class).getUser(id);
	}

}
