package cn.smbms.dao.provider;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;
import cn.smbms.utils.MyBatisUtil;

public class BillMapperTestNew {
	
	private Logger logger = Logger.getLogger(BillMapperTestNew.class);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SqlSession sqlSession = null;
		List<Provider> providerList = new ArrayList<Provider>();
		try {
			//1 创建sqlSession
			sqlSession = MyBatisUtil.createSqlSession();
			//2.配置参数
			Integer providerId = 1;
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			providerList = sqlSession.getMapper(ProviderMapper.class).getBillListByProviderId(providerId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
		for(Provider provider : providerList){
			logger.debug("providerList(include:billList) =====>"
					+ " id: " + provider.getId()
					+ " proCode: " + provider.getProCode()
					+ " proName: " + provider.getProName()
					+ " proContact: " + provider.getProContact()
					+ " proPhone: " + provider.getProPhone()
			);
			for(Bill bill : provider.getBillList()){
				logger.debug("bill ---->"
					+ " id: " + bill.getId()
					+ ",billCode: " + bill.getBillCode()
					+ ",productName: " + bill.getProductName()
					+ ",totalPrice: " + bill.getTotalPrice()
					+ ",isPayment: " + bill.getIsPayment()
				);
			}
		}
	}

}
