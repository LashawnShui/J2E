package cn.smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

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
		List<Provider> providerList = null;
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2 调用getMapper(Mapper.class)执行Mapper接口方法
			providerList = sqlSession.getMapper(ProviderMapper.class).getProviderList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.debug("基于mapper接口方式操作数据");
		for(Provider provider : providerList){
			logger.debug("testGetProviderList proCode" + provider.getProCode() + " and proName" + provider.getProName());
		}
	}

}
