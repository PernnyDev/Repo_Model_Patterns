package ilp037.behavioural.state;

public class LockedState extends State {

	public LockedState(Player player) {
		super(player);
		player.setPlaying(false);
	}
	@Override
	public String onLock() {
		if (!player.isPlaying()) {
			return "Locked";
		} else {
			player.changeState(new ReadyState(player));
			return "Stopped";
		}
	}

	@Override
	public String onPlay() {
		player.changeState(new PlayState(player));
		player.setPlaying(true);
		return player.startPlaying();
	}

	@Override
	public String onNext() {
		return "Locked...";
	}

	@Override
	public String onPrevious() {
		return "Locked...";
	}

}
