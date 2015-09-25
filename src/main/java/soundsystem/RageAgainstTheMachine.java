package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 9. 25.
 * Time : 오전 9:30
 */
@Component
public class RageAgainstTheMachine implements CompactDisc {
	private String title = "Rage Against The Machine.";
	private String artist = "Rage Against The Machine.";

	@Override public void play() {
		System.out.println("Playing" + title + " by " + artist);
	}
}
