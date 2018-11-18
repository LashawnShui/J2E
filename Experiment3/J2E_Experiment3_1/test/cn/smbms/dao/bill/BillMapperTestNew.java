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
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			Map<String, String> user = new HashMap<String, String>();
			user.put("productName", "米");
			user.put("providerId", "3");
			user.put("isPayment", "2");
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
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
