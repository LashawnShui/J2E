package cn.smbms.dao.bill;

import java.util.ArrayList;
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
		List<Bill> billList = new ArrayList<Bill>();
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			String productName = "米";
			Long providerId = 3L;
			Integer isPayment = 2;
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			billList = sqlSession.getMapper(BillMapper.class).getBillListByProviderId(productName, providerId, isPayment);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Bill bill : billList){
			logger.debug("billList=====>"
					+ " billCode: " + bill.getBillCode()
					+ ",productName: " + bill.getProductName()
					+ ",totalPrice: " + bill.getTotalPrice()
					+ ",isPayment: " + bill.getIsPayment()
			);
			logger.debug("provider---->"
					+ " providerCode: "+ bill.getProvider().getProCode()
					+ ",providerName: "+ bill.getProvider().getProName()
					+ ",providerContact: "+ bill.getProvider().getProContact()
					+ ",providerPhone: "+ bill.getProvider().getProPhone()
			);
		}
	}

}
