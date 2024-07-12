package ilp037.structural.bridge;

public class Square extends Shape {

	public Square(Color color) {
		super(color);
	}

	@Override
	public String draw() {
		return "Square drawing with " + color.fill();
	}

}
