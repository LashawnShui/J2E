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
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2 ����selectList����ִ�в�ѯ����
			count = sqlSession.selectOne("cn.smbms.dao.record.RecordMapper.count");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.debug("ͨ��SqlSessionʵ��ֱ��������ӳ���SQL���");
		
			logger.debug(count);
		
	}

}
