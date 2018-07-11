package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class PerformanceTest {
    @Autowired
    @Qualifier("performanceAnotherImpl")
    Performance anotherPerformance;

    @Autowired
    @Qualifier("performanceImpl")
    Performance performance;

    @Test
    public void name() {
        performance.perform("song");
        anotherPerformance.perform("song");
    }

    @Test
    public void getBeanByBeanName() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        String performanceBeanName = "performanceImpl";
        Performance performance = applicationContext.getBean(performanceBeanName, Performance.class);
        String anotherPerformanceBeanName = "performanceImpl";
        Performance anotherPerformance = applicationContext.getBean(anotherPerformanceBeanName, Performance.class);

        assertThat(performance).isNotNull();
        assertThat(anotherPerformance).isNotNull();
    }
}