package ioc;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.support.StaticApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

public class HelloLearningTest {
    @Test
    public void Hello클래스_빈_등록() throws Exception {
        StaticApplicationContext applicationContext = new StaticApplicationContext();
        applicationContext.registerSingleton("hello", Hello.class);

        Hello hello = applicationContext.getBean("hello", Hello.class);
        assertThat(hello).isNotNull();
        BeanDefinition helloBeanDefinition = applicationContext.getBeanDefinition("hello");
        assertThat(helloBeanDefinition).isNotNull();
        System.out.println(helloBeanDefinition.getDependsOn());
    }

    @Test
    public void BeanDefinition을_이용한_빈_등록() throws Exception {
        StaticApplicationContext applicationContext = new StaticApplicationContext();
        applicationContext.registerSingleton("hello", Hello.class);

        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        applicationContext.registerBeanDefinition("hello1", helloDef);

        Hello hello = applicationContext.getBean("hello", Hello.class);
        Hello hello1 = applicationContext.getBean("hello1", Hello.class);
        assertThat(hello).isNotSameAs(hello1);
        assertThat(applicationContext.getBeanDefinitionCount()).isEqualTo(2);
        assertThat(hello1.sayHello()).isEqualTo("Hello Spring");
    }

    @Test
    public void registerBeanWithBeanDependency() throws Exception {
        StaticApplicationContext applicationContext = new StaticApplicationContext();

        applicationContext.registerBeanDefinition("printer", new RootBeanDefinition(StringPrinter.class));

        BeanDefinition helloDef = new RootBeanDefinition(Hello.class);
        helloDef.getPropertyValues().addPropertyValue("name", "Spring");
        helloDef.getPropertyValues().addPropertyValue("printer", new RuntimeBeanReference("printer"));

        applicationContext.registerBeanDefinition("hello", helloDef);

        Hello hello = applicationContext.getBean("hello", Hello.class);
        hello.print();

        assertThat(applicationContext.getBean("printer").toString()).isEqualTo("Hello Spring");
    }
}