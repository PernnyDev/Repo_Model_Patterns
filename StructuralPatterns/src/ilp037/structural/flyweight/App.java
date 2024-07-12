package ilp037.structural.flyweight;

public class App {

	public static void main(String[] args) {
		Widget clockRL = WidgetFactory.getWidget("clock");
		clockRL.draw("red", "left");
		
		Widget clockBR = WidgetFactory.getWidget("clock");
		clockBR.draw("blue", "right");
		
		Widget clockGC = WidgetFactory.getWidget("clock");
		clockGC.draw("green", "center");
		
		Widget clockYB = WidgetFactory.getWidget("clock");
		clockYB.draw("yellow", "bottom");
		
		System.out.println("Number of objects running "
							+ ClockWidget.counter);
	}

}
