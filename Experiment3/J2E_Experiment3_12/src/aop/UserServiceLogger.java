package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class UserServiceLogger {
	private static final Logger log = Logger.getLogger(UserServiceLogger.class);
	
	public void before(JoinPoint jp) {
		log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
				+ " ������ ������Σ� " + Arrays.toString(jp.getArgs()));
	}
	public void afterReturning(JoinPoint jp, Object result) {
		log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
				+ " ������ ��������ֵ�� " + result);
	}
}
