package aop.inner;

import aop.Performance;
import org.springframework.stereotype.Component;

@Component
public class PerformanceAnotherImpl implements Performance{
    public void perform(String str) {
        System.out.println("perform another. " + str);
    }
}
