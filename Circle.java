package homeWork1;

public class Circle {

	private int radius;
	
	public Circle() {}
	
	// CTORs
	public Circle(int radius) {
		setRadius(radius);
	}
	// Methods
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public int getArea() {
		int area = 3 * radius * radius;
		return area;
	}
}