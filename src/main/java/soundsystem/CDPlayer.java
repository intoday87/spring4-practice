package soundsystem;

import lombok.Getter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Getter
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
