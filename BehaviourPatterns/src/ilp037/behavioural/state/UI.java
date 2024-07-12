package ilp037.behavioural.state;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UI {
	private Player player;
	private JTextField textField = new JTextField();
	
	public UI(Player player) {
		this.player = player;
	}
	public void init() {
		JFrame frame = new JFrame("MyPlayer");
		frame.setSize(300, 100);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.getContentPane().add(panel);
		JPanel buttons = new JPanel();
		buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
		panel.add(buttons);
		panel.add(textField);
		
		JButton play = new JButton("Play");
		play.addActionListener(e -> textField.setText(player.getState().onPlay()));
		buttons.add(play);

		JButton stop = new JButton("Stop");
		stop.addActionListener(e -> textField.setText(player.getState().onLock()));
		buttons.add(stop);

		JButton previous = new JButton("Previous");
		previous.addActionListener(e -> textField.setText(player.getState().onPrevious()));
		buttons.add(previous);

		JButton next = new JButton("Next");
		next.addActionListener(e -> textField.setText(player.getState().onNext()));
		buttons.add(next);
		
		frame.setVisible(true);
	}
}
