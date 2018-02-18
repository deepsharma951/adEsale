package com.org.abde.aop;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;




@Component
@Aspect
public class TimeLoggingAspect {
	private final Log log = LogFactory.getLog(this.getClass());
	@Around("execution(* com.org.abde.service.*.*(..))")
	public Object logaround(ProceedingJoinPoint point) throws Throwable{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object retVal = point.proceed();

		stopWatch.stop();

		StringBuffer logMessage = new StringBuffer();
		logMessage.append(point.getTarget().getClass().getName());
		logMessage.append(".");
		logMessage.append(point.getSignature().getName());
		logMessage.append("(");
		// append args
		Object[] args = point.getArgs();
		for (int i = 0; i < args.length; i++) {
			logMessage.append(args[i]).append(",");
		}
		if (args.length > 0) {
			logMessage.deleteCharAt(logMessage.length() - 1);
		}

		logMessage.append(")");
		logMessage.append(" execution time: ");
		logMessage.append(stopWatch.getTotalTimeMillis());
		logMessage.append(" ms");
		logMessage.append(" Date_Time -");
		logMessage.append(new Date());
		log.info(logMessage.toString());
		//System.out.println(logMessage.toString());
		return retVal;
		
	}
	@AfterReturning(
		      pointcut = "execution(* com.org.abde.service.*.*(..))",
		      returning= "result")
		   public void logAfterReturning(JoinPoint point, Object result) {
			StringBuffer logMessage = new StringBuffer();
			logMessage.append(point.getTarget().getClass().getName());
			logMessage.append(".");
			logMessage.append(point.getSignature().getName());
			logMessage.append(" returned value is ");
			logMessage.append(result);
			logMessage.append(" Date_Time -");
			logMessage.append(new Date());
			log.info(logMessage.toString());
		   }
	@AfterThrowing(
		      pointcut = "execution(* com.org.abde.service.*.*(..))",
		      throwing= "error")
		    public void logAfterThrowing(JoinPoint point, Throwable error) {

		StringBuffer logMessage = new StringBuffer();
		logMessage.append(point.getTarget().getClass().getName());
		logMessage.append(".");
		logMessage.append(point.getSignature().getName());
		logMessage.append(" Exception  ");
		logMessage.append(error);
		logMessage.append(" Date_Time -");
		logMessage.append(new Date());
		log.error(logMessage.toString());

		    }
	/*@After("execution(* com.org.abde.service.*.*(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");

	}*/
}   
