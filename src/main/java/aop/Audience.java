package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {
    @Before("execution(void aop.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silence cell phones");
    }
}
