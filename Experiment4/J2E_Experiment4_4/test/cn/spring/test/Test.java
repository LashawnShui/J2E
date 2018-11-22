package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Product;
import entity.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)context.getBean("user");
		Product product = (Product)context.getBean("product");
		System.out.println(user);
		System.out.println(product);
	}

}
