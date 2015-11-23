package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
	private String title;
	private String artist;
	private List<String> tracks;

	public BlankDisc(String artist, String title, List<String> tracks) {
		this.artist = artist;
		this.title = title;
		this.tracks = tracks;
	}

	public BlankDisc(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
		for (String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}
}
