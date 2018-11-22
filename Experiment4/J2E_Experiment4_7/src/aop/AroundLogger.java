package aop;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLogger {
	private static final Logger log = Logger.getLogger(AroundLogger.class);
	
	public Object aroundLogger(ProceedingJoinPoint jp) throws Throwable{
		log.info(" 调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() 
				+ " 方法。 方法入参： " + Arrays.toString(jp.getArgs()));
		try {
			Object result = jp.proceed();
			log.info(" 调用 " + jp.getTarget() + " 的 " + jp.getSignature().getName() 
					+ " 方法。 方法返回值： " + result);
			//产生一个异常
			int i = 0;
			i = i/0;
			return result;
		} catch (Throwable e) {
			log.error(jp.getSignature().getName() + " 方法发生异常：" + e);
			throw e;
		} finally {
			log.info(jp.getSignature().getName() + " 方法结束执行。");
		}
	}
}
