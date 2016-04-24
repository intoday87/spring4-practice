package aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class PerformanceTest {
    @Autowired
    Performance sut;

    @Test
    public void name() throws Exception {
        sut.perform();
    }

    @Test
    public void beanId() throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        String beanName = "performanceImpl";
        Object bean = applicationContext.getBean(beanName, Performance.class);

        assertThat(bean).isNotNull();
    }
}