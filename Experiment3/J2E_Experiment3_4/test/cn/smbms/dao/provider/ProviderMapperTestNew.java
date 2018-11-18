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
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.���ò���
			Provider provider = new Provider();
			provider.setId(16);
			provider.setProCode("testmotify");
			provider.setProName("�����û��޸�");
			provider.setModifyDate(new Date());
			provider.setModifyBy(1);
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			count = sqlSession.getMapper(ProviderMapper.class).modify(provider);
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
		logger.debug("testModify count: " + count);
	}

}
