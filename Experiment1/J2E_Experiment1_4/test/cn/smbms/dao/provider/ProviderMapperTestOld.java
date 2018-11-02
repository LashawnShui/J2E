package cn.smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.pojo.Provider;
import cn.smbms.utils.MyBatisUtil;

public class ProviderMapperTestOld {
	
	private Logger logger = Logger.getLogger(ProviderMapperTestOld.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		List<Provider> providerList = null;
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2 调用selectList方法执行查询操作
			providerList = sqlSession.selectList("cn.smbms.dao.provider.ProviderMapper.getProviderList");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.debug("通过SqlSession实例直接运行已映射的SQL语句");
		for(Provider provider : providerList){
			logger.debug("testGetProviderList proCode" + provider.getProCode() + " and proName" + provider.getProName());
		}
	}

}
