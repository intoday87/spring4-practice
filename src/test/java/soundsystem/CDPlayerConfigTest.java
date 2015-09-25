package soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.Assertions.assertThat;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 9. 25.
 * Time : 오전 9:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerConfigTest {
	@Autowired
	private CompactDisc cd;

	@Autowired
	private CDPlayer player;

	@Test
	public void testName() throws Exception {
		assertThat(cd).isNotNull();
	}
}