package aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class ErrorLogger {
	private static final Logger log = Logger.getLogger(ErrorLogger.class);
	
	@AfterThrowing(pointcut = "execution(* service.UserService.*(..))", throwing = "e")
	public void afterThrowing(JoinPoint jp, RuntimeException e){
		log.error(jp.getSignature().getName() + " 方法发生异常：" + e);
	}
}
