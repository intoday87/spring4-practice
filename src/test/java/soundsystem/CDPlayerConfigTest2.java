package soundsystem;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 9. 25.
 * Time : 오전 10:24
 */
public class CDPlayerConfigTest2 {
	ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
	}

	@Test
	public void testName() throws Exception {
		final CompactDisc rageAgainstTheMachine = applicationContext.getBean("rageAgainstTheMachine", CompactDisc.class);

		assertThat(rageAgainstTheMachine).isNotNull();
	}

	@Test
	public void testName2() throws Exception {

	}
}