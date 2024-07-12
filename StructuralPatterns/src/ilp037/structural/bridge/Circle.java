package ilp037.structural.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Circle drawing with " + color.fill();
	}

}
