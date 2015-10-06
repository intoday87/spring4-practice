package soundsystem;

import java.util.List;

/**
 * Created With Intellij IDEA.
 * User : Nick(LeeDongHo))
 * Date : 15. 10. 5.
 * Time : 오후 12:54
 */
public class BlankDisk implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisk(String artist, String title, List<String> tracks) {
		this.artist = artist;
		this.title = title;
		this.tracks = tracks;
	}

	@Override public void play() {
		System.out.println("Playing " + title + " by" + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}
}
