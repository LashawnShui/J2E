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
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			User user = new User();
			user.setId(17);
			user.setUserCode("testmotify");
			user.setUserName("测试用户修改");
			user.setUserPassword("0000000");
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1980-10-10"));
			user.setAddress("地址测试修改");
			user.setGender(2);
			user.setPhone("13600002222");
			user.setUserRole(2);
			user.setModifyBy(1);
			user.setModifyDate(new Date());
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			count = sqlSession.getMapper(UserMapper.class).modify(user);
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
		logger.debug("testModify count: " + count);
	}

}
