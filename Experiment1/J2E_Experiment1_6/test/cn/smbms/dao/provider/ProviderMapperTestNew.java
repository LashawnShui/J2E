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
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2 调用getMapper(Mapper.class)执行Mapper接口方法
			recordList = sqlSession.getMapper(RecordMapper.class).selectRecordsAfter2015();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Record record : recordList){
			logger.debug("testGetRecordList 型号：" + record.getVersion() + "  出厂价格：" + record.getFactoryPrice() + "  出厂日期：" + record.getManufactureDate());
		}
	}

}
