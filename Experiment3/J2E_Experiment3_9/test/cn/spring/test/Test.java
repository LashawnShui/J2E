package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springdemo.HelloSpring;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
		helloSpring.print();
	}

}
