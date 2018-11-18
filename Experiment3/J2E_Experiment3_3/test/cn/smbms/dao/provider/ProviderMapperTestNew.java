package cn.smbms.dao.provider;

import java.util.Date;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.provider.ProviderMapper;
import cn.smbms.pojo.Provider;
import cn.smbms.utils.MyBatisUtil;

public class ProviderMapperTestNew {
	
	private Logger logger = Logger.getLogger(ProviderMapperTestNew.class);
	
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
			Provider provider = new Provider();
			provider.setId(16);
			provider.setProCode("testmotify");
			provider.setProName("测试用户修改");
			provider.setModifyDate(new Date());
			provider.setModifyBy(1);
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			count = sqlSession.getMapper(ProviderMapper.class).modify(provider);
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
