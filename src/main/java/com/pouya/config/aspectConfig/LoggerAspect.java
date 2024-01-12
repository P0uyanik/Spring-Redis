package com.pouya.config.aspectConfig;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
@Slf4j
public class LoggerAspect {
    @Before("execution(* com.pouya.controller.UserController.addNewRole(..))")
    public void beforeExecution()
    {
        log.error("hier ist beforeExecution");
    }
    @After("execution(* com.pouya.controller.UserController.addNewRole(..))")
    public void afterExecution()
    {
        log.error("hier ist afterExecution");
    }
}
