package ilp037.structural.bridge;

public class App {

	public static void main(String[] args) {
		Circle circle = new Circle(new Blue());
		String draw = circle.draw();
		System.out.println(draw);
		
		circle.color = new Red();
		draw = circle.draw();
		System.out.println(draw);
		
		Square sqr = new Square(new Red());
		draw = sqr.draw();
		System.out.println(draw);
	}

}
