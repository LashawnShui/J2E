package cn.smbms.dao.provider;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.record.RecordMapper;
import cn.smbms.pojo.Record;
import cn.smbms.utils.MyBatisUtil;

public class ProviderMapperTestNew {
	
	private Logger logger = Logger.getLogger(ProviderMapperTestNew.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		List<Record> recordList = null;
		try {
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			recordList = sqlSession.getMapper(RecordMapper.class).selectRecordsAfter2015();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Record record : recordList){
			logger.debug("testGetRecordList �ͺţ�" + record.getVersion() + "  �����۸�" + record.getFactoryPrice() + "  �������ڣ�" + record.getManufactureDate());
		}
	}

}
