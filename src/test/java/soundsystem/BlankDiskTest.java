package soundsystem;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 10. 5.
 * Time : 오후 1:03
 */
public class BlankDiskTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("CDPlayerConfig.xml");
	}

	@Test
	public void testName() throws Exception {
		final CDPlayer bean = applicationContext.getBean("cdPlayer", CDPlayer.class);
		assertThat(bean).isNotNull();
		bean.play();
	}
}