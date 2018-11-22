package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;


import service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService)ctx.getBean("service");
		User user = new User(new Integer(1), "test", "123456", "test@xxx.com");
		try {
			service.addNewUser(user);
		} catch (Exception e) {
			System.out.println("已捕获异常，测试程序正常结束");
		}
	}

}
