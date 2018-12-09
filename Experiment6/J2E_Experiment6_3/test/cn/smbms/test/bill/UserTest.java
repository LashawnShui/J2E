package cn.smbms.test.bill;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.User;
import cn.smbms.service.UserService;

public class UserTest {

	@Test
	public void testUserService() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService=(UserService) ctx.getBean("userService");
		User user=userService.getUser(8);
		user.setPhone("13111111111");
		//�޸��û���Ϣ
		userService.update(user);
		System.out.println("ID: "+user.getId() +"�û���Ϣ���޸�");
		
		
		//�޸��û�����
		user.setUserPassword("111111");
		userService.changePwd(user);
		System.out.println("ID: "+user.getId() +"�������޸�");
		
		//ɾ���û���Ϣ
		userService.delete(user);
		System.out.println("ID: "+user.getId() +"�û���Ϣ��ɾ��");	
	}

}
