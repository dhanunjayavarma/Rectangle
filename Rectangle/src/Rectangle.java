
public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
		this.perimeter=2*(this.length+this.width);
	}
	public double getPerimeter() {
		return perimeter;
	}
}
