
public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;
	private static final int NUMBER_OF_EQUAL_SIDES = 2;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.perimeter = NUMBER_OF_EQUAL_SIDES * (this.length + this.width);
		this.area = this.length * this.width;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
}
