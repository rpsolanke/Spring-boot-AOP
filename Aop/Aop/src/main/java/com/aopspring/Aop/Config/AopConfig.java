package com.aopspring.Aop.Config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;



@Aspect
@Configuration
public class AopConfig {
	 
	Logger logger = LoggerFactory.getLogger(AopConfig.class);
	@Before("execution(public * com.aopspring.Aop.Controller.*.*(..) )")
	public void logbeforeAll(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature().getName());
	}

}
