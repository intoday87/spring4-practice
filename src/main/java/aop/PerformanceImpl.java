package aop;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {
    public void perform(String str) {
        System.out.println("performed " + str);
    }
}
