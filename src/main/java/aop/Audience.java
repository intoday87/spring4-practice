package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
    @Pointcut("execution(void aop.Performance.perform(..))")
    public void performance() {}

    @Before("performance() && @annotation(aop.inner.MyAnnotation)")
    public void beforePerformanceImpl() {
        System.out.println("before performanceAnotherImpl");
    }

    @Before("execution(void aop.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silence cell phones");
    }

    @After("execution(void aop.Performance.perform(..)) && bean(performanceAnotherImpl)")
    public void afterPerformanceAnotherImpl() {
        System.out.println("end of performanceAnotherImpl");
    }

    @After("execution(void aop.Performance.perform(..)) && bean(performanceImpl)")
    public void afterPerformanceImpl() {
        System.out.println("end of performanceImpl");
    }
}
