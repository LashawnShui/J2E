package cn.spring.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Bill;
import cn.smbms.service.bill.BillService;

public class Test {

	private static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		BillService billService = (BillService) ctx.getBean("billService");
		
		List<Bill> billList = new ArrayList<Bill>();
		Map<String, String> billMap = new HashMap<String, String>();
		billMap.put("productName", "รื");
		billMap.put("providerId", "3");
		billMap.put("isPayment", "2");
		billList = billService.findBillsWithConditions(billMap);
		
		for(Bill billResult : billList){
			logger.debug("testGetBillList billCode:" + billResult.getBillCode()
					 	+ " and productName:" + billResult.getProductName()
					 	+ " and providerName:"+ billResult.getProviderName()
					 	+ " and totalPrice:"+ billResult.getTotalPrice()
					 	+ " and isPayment:"+ billResult.getIsPayment()
					 	+ " and creationDate:"+ billResult.getCreationDate()
			);
		}
	}

}
