package com.example.spring.aop.demospringaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class afterAspect {
private Logger logger=LoggerFactory.getLogger(this.getClass());
@AfterReturning(value="execution(* com.example.spring.aop.demospringaop.business.*.*(..))",returning="result")
public void after(JoinPoint joinpoint,Object result) {
logger.info("{} returned with value {}",joinpoint,result);
}
@AfterThrowing(value="execution(* com.example.spring.aop.demospringaop.business.*.*(..))",throwing="exception")
public void afterThrowing(JoinPoint joinpoint,Exception exception) {
	logger.info("{} throws exception {}",joinpoint,exception);
         }
}
