package qualifier.name;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanIdConfiguration.class)
public class BeanIdConfigurationTest extends TestCase {
    @Autowired
    @Qualifier("two")
    Number number;

    @Test
    public void test() throws Exception {
        assertThat(number).isInstanceOf(One.class);
    }
}