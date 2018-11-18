package cn.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.printer.Printer;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Printer printer = (Printer)context.getBean("printer");
		String content = "��λ�����������������������ض���˵����Щ�����ǳ����ã���Ϊ����ʵ���ˡ����Ʒ�ת����������˵����������Ի󣺿��Ʒ�ת�ǿ�������е����������������Ϊʹ���˿��Ʒ�ת����Ϊ��Щ�������������ڲ�ͬ���ͺ�����˵���ҵĽγ������ڲ�ͬ�ģ���Ϊ����4�����ӡ���";
		printer.print(content);
	}

}
