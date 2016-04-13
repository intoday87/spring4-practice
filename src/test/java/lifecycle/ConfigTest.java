package lifecycle;

import com.sun.tools.javac.util.StringUtils;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

public class ConfigTest {

    private ApplicationContext applicationContext;

    public static final String SOME_BEAN_NAME = "someBean";

    @Before
    public void setUp() throws Exception {
        applicationContext = new AnnotationConfigApplicationContext("lifecycle");
    }

    @Test
    public void BeanNameAware을_구현해서_주입된_이름은_기본값으로_class_이름의_첫글자를_lowercase한_이름이다() throws Exception {
        String beanName = getBeanNameByClass(SomeBean.class);
        SomeBean someBean = (SomeBean) applicationContext.getBean(beanName);

        assertThat(someBean.name).isEqualTo(beanName);
    }

    private String getBeanNameByClass(Class<?> someClass) {
        String beanName = someClass.getCanonicalName().substring(someClass.getCanonicalName().lastIndexOf('.') + 1);
        return StringUtils.toLowerCase(beanName.substring(0,1)).concat(beanName.substring(1));
    }
}