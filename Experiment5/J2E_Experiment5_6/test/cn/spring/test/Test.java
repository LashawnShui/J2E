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
		provider.setId(18);
		provider.setProCode("testAdd");
		provider.setProName("≤‚ ‘");
		
		boolean result = providerService.addNewProvider(provider);
		logger.debug("testAddNewProvider result:" + result);
		
//		Provider provider = new Provider();
//		provider.setId(18);
//		provider.setProCode("testUpdate");
//		provider.setProName("≤‚ ‘–ﬁ∏ƒ");
//		
//		boolean result = providerService.updateProvider(provider);
//		logger.debug("testUpdateProvider result:" + result);
		
//		Integer delId = 18;
//		
//		boolean result = providerService.deleteProvider(delId);
//		logger.debug("testDeleteProvider result:" + result);
	}

}
