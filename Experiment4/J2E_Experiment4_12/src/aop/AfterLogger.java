package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterLogger {
	private static final Logger log = Logger.getLogger(AfterLogger.class);
	
	@After("execution(* service.UserService.*(..))")
	public void afterLogger(JoinPoint jp){
		log.info(jp.getSignature().getName() + " ��������ִ�С�");
	}
}
