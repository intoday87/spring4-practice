package soundsystem;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerTestXMLConfig {
	@Test
	public void testName() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CDPlayerConfig.xml");
	}
}