package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.User;

import service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService service = (UserService)ctx.getBean("service");
		User user = new User(new Integer(1), "test", "123456", "test@xxx.com");
		service.addNewUser(user);
	}

}
