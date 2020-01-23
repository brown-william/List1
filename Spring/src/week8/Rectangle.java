/**
 * 
 */
package week8;

/**
 * @author Nate
 *
 */
public class Rectangle {

	
	
	
	// declare variables
	double width;
	double height;
	
	//No arg constructor
	Rectangle() {
		width = 1;
		height = 1;
	}
	//Second Constructor
	
	Rectangle(double newWidth, double newHeight) {
		width =newWidth;
		height = newHeight;
	}
	//method to return the area of the rectangle
	double getArea() {
		
		return width * height;
	}
	//method to return the perimeter of the rectangle
	double getPerimeter() {
		
		return (width + height) * 2;
	}
	
}
