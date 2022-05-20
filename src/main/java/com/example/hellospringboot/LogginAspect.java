package com.example.hellospringboot;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogginAspect {
    private static final Logger log = LoggerFactory.getLogger(LogginAspect.class);

    @Pointcut("within(com.example.hellospringboot..*)")
    public void pointcut() {

    }

    @Before("pointcut()")
    public void logMethod(JoinPoint joinPoint) {
       log.info(joinPoint.toString());
    }
}
