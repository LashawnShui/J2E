package cn.smbms.dao.bill;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		List<Provider> providerList = new ArrayList<Provider>();
		try {
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.���ò���
			String proCode = null;
			String proName = "";
			String proContact = "";
			Date creationDate = new SimpleDateFormat("yyyy-MM-dd").parse("2016-01-01");
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			providerList = sqlSession.getMapper(ProviderMapper.class).getProviderList_choose(proCode, proName, proContact, creationDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Provider provider : providerList){
			logger.debug("providerList=====>"
					+ " proCode: "+ provider.getProCode()
					+ ",proName: "+ provider.getProName()
					+ ",proContact: "+ provider.getProContact()
					+ ",creationDate: "+ provider.getCreationDate()
			);
		}
	}

}
