package com.example.spring.aop.demospringaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class aroundAspect {
private Logger logger=LoggerFactory.getLogger(this.getClass());
@Around(value="execution(* com.example.spring.aop.demospringaop.business.*.*(..))")
public void around(ProceedingJoinPoint joinpoint) throws Throwable {
	long startTime=System.currentTimeMillis();
	joinpoint.proceed();
	long timeTaken=System.currentTimeMillis()-startTime;
logger.info("Time taken by {} is {}",joinpoint,timeTaken);
}
}