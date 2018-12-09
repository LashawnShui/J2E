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
		bill.setProductName("�۹���");
		bill.setProductDesc("����");
		bill.setProductUnit("ƿ");
		bill.setProductCount(new BigDecimal(2000));
		bill.setTotalPrice(new BigDecimal(4000));
		bill.setIsPayment(2);
		bill.setCreatedBy(1);
		bill.setCreationDate(new Date());
		bill.setProviderId(2);
		//��Ӷ���
		billService.add(bill);
		System.out.println("ID: "+bill.getId() +"�����");		
		
		//�޸Ķ���
		System.out.println(bill.getTotalPrice());
		bill.setTotalPrice(new BigDecimal(5000));
		billService.update(bill);
		System.out.println("ID: "+bill.getId() +"���޸�");	
		System.out.println(bill.getTotalPrice());
		//ɾ������		
		billService.delete(bill.getId());
		System.out.println("ID: "+bill.getId() +"��ɾ��");		
	}

}
