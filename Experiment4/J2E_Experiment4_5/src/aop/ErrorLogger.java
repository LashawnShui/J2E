package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

public class ErrorLogger {
	private static final Logger log = Logger.getLogger(ErrorLogger.class);
	
	public void afterThrowing(JoinPoint jp, RuntimeException e){
		log.error(jp.getSignature().getName() + " ���������쳣��" + e);
	}
}
