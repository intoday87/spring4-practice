package injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soundsystem.BlankDisc;

public class InjectionConfigurationTest{
    @Test
    public void test() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(InjectionConfiguration.class);

        BlankDisc compactDisc = context.getBean("compactDisc", BlankDisc.class);

        compactDisc.play();
    }
}