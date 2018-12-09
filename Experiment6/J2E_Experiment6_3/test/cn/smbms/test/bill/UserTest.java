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
		//修改用户信息
		userService.update(user);
		System.out.println("ID: "+user.getId() +"用户信息已修改");
		
		
		//修改用户密码
		user.setUserPassword("111111");
		userService.changePwd(user);
		System.out.println("ID: "+user.getId() +"密码已修改");
		
		//删除用户信息
		userService.delete(user);
		System.out.println("ID: "+user.getId() +"用户信息已删除");	
	}

}
