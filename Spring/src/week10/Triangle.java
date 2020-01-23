package week10;



public class Triangle extends GeometricObject {

	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double sp = (side1 + side2 + side3) / 2;
		return Math.sqrt(sp * (sp - side1) * (sp - side2) * (sp - side3) );
	}
	
	@Override
	public String toString() {
		return super.toString() + "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
	
	
}
