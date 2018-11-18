package cn.smbms.dao.bill;

import java.util.ArrayList;
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
			Map<String, Object> conditionMap = new HashMap<String, Object>();
			List<Integer> providerIdList = new ArrayList<Integer>();
			providerIdList.add(1);
			providerIdList.add(2);
			conditionMap.put("providerIdList", providerIdList);
			conditionMap.put("billCode", "2");
			//3 调用getMapper(Mapper.class)执行Mapper接口方法
			billList = sqlSession.getMapper(BillMapper.class).getBillByProviderId_foreach_map(conditionMap);
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
			);
		}
	}

}
