package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 9. 25.
 * Time : 오전 9:08
 */
@Configuration
public class CDPlayerConfig {
	@Bean
	public CompactDisc rageAgainstTheMachine() {
		return new RageAgainstTheMachine();
	}
}
