package cn.smbms.dao.bill;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.dao.bill.BillMapper;
import cn.smbms.pojo.Bill;
import cn.smbms.utils.MyBatisUtil;

public class BillMapperTestNew {
	
	private Logger logger = Logger.getLogger(BillMapperTestNew.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		List<Bill> billList = null;
		try {
			//1 ����sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.���ò���
			String billCode = "";
			Integer providerId = null;
			Integer pageSize = 5;
			Integer currentPageNo = 0;
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			billList = sqlSession.getMapper(BillMapper.class).getBillList(billCode, providerId, currentPageNo, pageSize);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		logger.debug("billList.size ----> " + billList.size());
		for(Bill bill : billList){
			logger.debug("bill =======> id: " + bill.getId()
						+ " and billCode: " + bill.getBillCode()
						+ " and billName: " + bill.getBillCode()
						+ " and providerId: " + bill.getProviderId()
						+ " and providerName: " + bill.getProviderName()
			);
		}
	}

}
