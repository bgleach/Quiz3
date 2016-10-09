package Triangle;
import Triangle.GeometricObject;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private double s;
	private java.util.Date dateCreated;
	
	// no-arg constructor that creates a default triangle
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	// constructor that creates a triangle with the specified side1, side2, and side3
	public Triangle (double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		dateCreated = new java.util.Date();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// accessor methods for all three data fields
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	// method named getArea() that returns the area of this triangle
	public double getArea() {
		s = ((side1 + side2 + side3)/ 2);
		return (Math.sqrt(s * ((s-side1) * (s-side2) * (s-side3))));
	}
	
	// method named getPerimeter() that returns the perimeter of this triangle
	public double getPerimeter() {
		return (side1 + side2 +side3);
	}
	
	// method named toString() that returns a string description for the triangle
	public String toString() {
		return ("Area is" + getArea() + ", perimeter is" + getPerimeter()+ ", created on " + dateCreated + ", color is" + getColor() +
			      " and fill" + isFilled());
	}
	
	
}
