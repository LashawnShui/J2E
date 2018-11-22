package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserServiceLogger {
	private static final Logger log = Logger.getLogger(UserServiceLogger.class);
	
	@Pointcut("execution(* service.UserService.*(..))")
	public void pointcut(){}
	
	@Before("pointcut()")
	public void before(JoinPoint jp) {
		log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
				+ " ������ ������Σ� " + Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(pointcut = "pointcut()", returning = "result")
	public void afterReturning(JoinPoint jp, Object result) {
		log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
				+ " ������ ��������ֵ�� " + result);
	}
}
