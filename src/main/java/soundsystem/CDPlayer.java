package soundsystem;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 9. 25.
 * Time : 오전 9:26
 */
@Component
public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;

	@Inject
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}

	public void play() {
		cd.play();
	}
}
