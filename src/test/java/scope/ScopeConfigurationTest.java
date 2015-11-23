package scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ScopeConfiguration.class)
public class ScopeConfigurationTest {

    @Autowired
    PrototypeScope prototypeScope1;
    @Autowired
    PrototypeScope prototypeScope2;
    @Autowired
    SingletonScope singletonScope1;
    @Autowired
    SingletonScope singletonScope2;

    @Test
    public void testPrototypeScopeBean() throws Exception {
        assertThat(prototypeScope1).isNotEqualTo(prototypeScope2);
    }

    @Test
    public void testSingletonScopeBean() throws Exception {
        assertThat(singletonScope1).isEqualTo(singletonScope2);
    }
}