package ilp037.structural.flyweight;

public class ClockWidget extends Widget {
	public static int counter; //só para teste
	
	public ClockWidget() {
		super("clock", "code to create a clock widget");
		counter++;
	}

	@Override
	public void draw(String color, String position) {
		System.out.println("Drawing a clock with "
							+ color
							+ " in "
							+ position);
	}

}
