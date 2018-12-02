package cn.spring.test;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Provider> providerList = new ArrayList<Provider>();
		providerList = providerService.findAllProviders();
		
		for(Provider providerResult : providerList){
			logger.debug("testGetProviderList id:" + providerResult.getId()
					 	+ " and proCode:" + providerResult.getProCode()
					 	+ " and proName:"+ providerResult.getProName()
			);
		}
	}

}
