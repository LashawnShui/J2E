package cn.smbms.dao.provider;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.utils.MyBatisUtil;

public class ProviderMapperTestOld {
	
	private Logger logger = Logger.getLogger(ProviderMapperTestOld.class);
	
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
			//2 调用selectList方法执行查询操作
			count = sqlSession.selectOne("cn.smbms.dao.record.RecordMapper.count");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.debug("通过SqlSession实例直接运行已映射的SQL语句");
		
			logger.debug(count);
		
	}

}
