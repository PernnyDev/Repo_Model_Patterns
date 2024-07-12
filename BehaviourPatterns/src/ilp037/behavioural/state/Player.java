package ilp037.behavioural.state;

import java.util.Arrays;
import java.util.List;

public class Player {
	private State state;
	private boolean playing = false;
	private List<String> playlist = Arrays.asList("Track 1", "Track 2", "Track 3", "Track 4", "Track 5");
	private int currentTrack = 0;
	
	//Constructor
	public Player() {
		this.state = new ReadyState(this);
		this.setPlaying(true);
	}
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	public boolean isPlaying() {
		return playing;
	}
	public void changeState(State state) {
		this.state = state;
	}
	public String startPlaying() {
		return "Playing " + playlist.get(currentTrack);
	}
	public String nextTrack() {
		currentTrack++;
		if (currentTrack > playlist.size() - 1) {
			currentTrack = 0;
		}
		return startPlaying();
	}
	public String previousTrack() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playlist.size() - 1;
		}
		return startPlaying();
	}
	public void setCurrentAfterStop() {
		currentTrack = 0;
	}
	public State getState() {
		return state;
	}
}
