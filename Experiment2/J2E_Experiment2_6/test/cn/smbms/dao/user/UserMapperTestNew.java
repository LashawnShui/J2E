package cn.smbms.dao.user;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.user.UserMapper;
import cn.smbms.pojo.User;
import cn.smbms.utils.MyBatisUtil;

public class UserMapperTestNew {
	
	private Logger logger = Logger.getLogger(UserMapperTestNew.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		int count = 0;
		try {
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.���ò���
			User user = new User();
			user.setUserCode("test001");
			user.setUserName("�����û� 001");
			user.setUserPassword("1234567");
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1984-12-12"));
			user.setAddress("��ַ����");
			user.setGender(1);
			user.setPhone("13688783697");
			user.setUserRole(1);
			user.setCreatedBy(1);
			user.setCreationDate(new Date());
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			count = sqlSession.getMapper(UserMapper.class).add(user);
			//ģ���쳣�����лع�
			//int i = 2/0;
			sqlSession.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			count = 0;
		}finally{
			sqlSession.close();
		}
		logger.debug("testAdd count: " + count);
	}

}
