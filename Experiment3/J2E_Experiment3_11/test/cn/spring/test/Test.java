package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.printer.Printer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer = (Printer)context.getBean("printer");
		String content = "几位轻量级容器的作者曾骄傲地对我说：这些容器非常有用，因为它们实现了“控制反转”。这样的说辞让我深感迷惑：控制反转是框架所共有的特征，如果仅仅因为使用了控制反转就认为这些轻量级容器与众不同，就好像在说“我的轿车是与众不同的，因为它有4个轮子。”";
		printer.print(content);
	}

}
