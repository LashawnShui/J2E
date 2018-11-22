package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundLogger {
	private static final Logger log = Logger.getLogger(AroundLogger.class);
	
	@Around("execution(* service.UserService.*(..))")
	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
		log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
				+ " ������ ������Σ� " + Arrays.toString(jp.getArgs()));
		try {
			Object result = jp.proceed();
			log.info(" ���� " + jp.getTarget() + " �� " + jp.getSignature().getName() 
					+ " ������ ��������ֵ�� " + result);
			//����һ���쳣
			int i = 0;
			i = i/0;
			return result;
		} catch (Throwable e) {
			log.error(jp.getSignature().getName() + " ���������쳣��" + e);
			throw e;
		} finally {
			log.info(jp.getSignature().getName() + " ��������ִ�С�");
		}
	}
}
