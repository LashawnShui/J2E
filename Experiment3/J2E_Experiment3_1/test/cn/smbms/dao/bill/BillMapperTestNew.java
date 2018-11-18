package cn.smbms.dao.bill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
			Map<String, String> user = new HashMap<String, String>();
			user.put("productName", "��");
			user.put("providerId", "3");
			user.put("isPayment", "2");
			//3 ����getMapper(Mapper.class)ִ��Mapper�ӿڷ���
			billList = sqlSession.getMapper(BillMapper.class).getBillList(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Bill bill : billList){
			logger.debug("id: " + bill.getId()
						+ " and userCode: " + bill.getBillCode()
						+ " and productName: " + bill.getProductName()
						+ " and providerId: " + bill.getProviderId()
						+ " and providerName: " + bill.getProviderName()
						+ " and totalPrice: " + bill.getTotalPrice()
						+ " and isPayment: " + bill.getIsPayment()
						+ " and creationDate: " + bill.getCreationDate()
			);
		}
	}

}
