package week8;

public class A9dot1 {

	// test program to create objects and call the rectangle class
		public static void main(String[] args) {
			
			System.out.printf("%-15s %-15s | %-15s %-15s %n", "Width", "Height", "Area","Perimeter");
			System.out.println("--------------------------------------------------------------------");
			
			
			//first object
			Rectangle rectangle1 = new Rectangle(4,40);
			
			// display width, height, area, and perimeter of object
			System.out.printf("%-15.1f %-15.1f | %-15.1f %-15.1f\n", rectangle1.width, rectangle1.height, rectangle1.getArea(), rectangle1.getPerimeter());
			
			//second object
			Rectangle rectangle2 = new Rectangle(3.5, 35.9);
			
			//display width, height, area, and perimeter of object
			System.out.printf("%-15.1f %-15.1f | %-15.2f %-15.2f\n", rectangle2.width, rectangle2.height, rectangle2.getArea(), rectangle2.getPerimeter());
			
			
		}
	
	
}
