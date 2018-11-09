package cn.smbms.dao.user;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.user.UserMapper;
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
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			Integer id = 17;
			String pwd = "8888888";
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			count = sqlSession.getMapper(UserMapper.class).updatePwd(id, pwd);
			//模拟异常，进行回滚
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
		logger.debug("testUpdatePwd count: " + count);
	}

}
