package com.cognizant.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.cognizant.service.*.*(..))")
    public void beforeMethod() {
        System.out.println("Before method execution...");
    }

    @After("execution(* com.cognizant.service.*.*(..))")
    public void afterMethod() {
        System.out.println("After method execution...");
    }
}