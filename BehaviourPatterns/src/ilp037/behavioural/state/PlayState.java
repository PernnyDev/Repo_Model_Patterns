package ilp037.behavioural.state;

public class PlayState extends State {

	public PlayState(Player player) {
		super(player);
	}
	@Override
	public String onLock() {
		player.changeState(new LockedState(player));
		player.setCurrentAfterStop();
		return "Stop playing";
	}

	@Override
	public String onPlay() {
		player.changeState(new ReadyState(player));
		return "Paused";
	}

	@Override
	public String onNext() {
		return player.nextTrack();
		
	}

	@Override
	public String onPrevious() {
		return player.previousTrack();
	}

}
