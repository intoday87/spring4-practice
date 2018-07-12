package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class ParamCounter {
    private Map<String, Integer> map;

    public ParamCounter() {
        map = new HashMap<String, Integer>();
    }

    @Pointcut("execution(* aop.Performance.perform(String)) && args(a)")
    public void track(String a) {}

    @Before("track(str)")
    public void countParam(String str) {
        Integer count = map.get(str);
        if (count == null) {
            count = 0;
        }

        map.put(str, count + 1);
        System.out.println(str + " count is " + map.get(str));
    }
}
