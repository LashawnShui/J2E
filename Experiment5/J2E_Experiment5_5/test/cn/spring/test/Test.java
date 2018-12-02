package cn.spring.test;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.pojo.Provider;
import cn.smbms.service.provider.ProviderService;

public class Test {

	private static Logger logger = Logger.getLogger(Test.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProviderService providerService = (ProviderService) ctx.getBean("providerService");
		
		Provider provider = new Provider();
		provider.setId(17);
		provider.setProCode("testAdd");
		provider.setProName("≤‚ ‘");
		
		boolean result = providerService.addNewProvider(provider);
		logger.debug("testAddNewProvider result:" + result);
	}

}
