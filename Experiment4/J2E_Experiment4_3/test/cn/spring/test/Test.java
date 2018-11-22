package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import bean.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)context.getBean("userService");
		User user = new User(new Integer(1), "test", "123456", "test@xxx.com");
		userService.addNewUser(user);
	}

}
