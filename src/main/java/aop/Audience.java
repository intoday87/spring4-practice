package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

    @Before("execution(* aop.Performance.perform(..)) && within(aop.*) && bean('performanceImpl'))")
    public void silenceCellPhones() {
        System.out.println("Silence cell phones");
    }
}
