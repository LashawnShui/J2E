package cn.smbms.dao.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<User> userList = null;
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			Map<String, String> userMap = new HashMap<String, String>();
			userMap.put("uName", "赵");
			userMap.put("uRole", "3");
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			userList = sqlSession.getMapper(UserMapper.class).getUserListByMap(userMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(User user : userList){
			logger.debug("userName: " + user.getUserName() + "userCode: " + user.getUserCode());
		}
	}

}
