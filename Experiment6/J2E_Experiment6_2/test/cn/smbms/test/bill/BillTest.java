package cn.smbms.test.bill;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.smbms.pojo.Bill;
import cn.smbms.service.BillService;

public class BillTest {

	@Test
	public void testBillService() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		BillService billService=(BillService) ctx.getBean("billService");
		
		Bill bill=new Bill();
		bill.setBillCode("BILL2016_019");
		bill.setProductName("哇哈哈");
		bill.setProductDesc("饮料");
		bill.setProductUnit("瓶");
		bill.setProductCount(new BigDecimal(2000));
		bill.setTotalPrice(new BigDecimal(4000));
		bill.setIsPayment(2);
		bill.setCreatedBy(1);
		bill.setCreationDate(new Date());
		bill.setProviderId(2);
		//添加订单
		billService.add(bill);
		System.out.println("ID: "+bill.getId() +"已添加");		
		
		//修改订单
		System.out.println(bill.getTotalPrice());
		bill.setTotalPrice(new BigDecimal(5000));
		billService.update(bill);
		System.out.println("ID: "+bill.getId() +"已修改");	
		System.out.println(bill.getTotalPrice());
		//删除订单		
		billService.delete(bill.getId());
		System.out.println("ID: "+bill.getId() +"已删除");		
	}

}
