package week10;
import java.util.Scanner;
public class A11dot1 {

	
	public static void main(String[] args) {
	
	Scanner newScan = new Scanner(System.in);
	
	
	System.out.println("Enter first side");
	double side1 = newScan.nextDouble();
	if (side1 < 0) {
		System.out.println("Incorrect input");
		System.exit(1);
	}
	    
	System.out.println("Enter second side");
	double side2 = newScan.nextDouble();
	if (side2 < 0) {
		System.out.println("Incorrect input");
		System.exit(1);
	}
	    
	System.out.println("Enter third side");
	double side3 = newScan.nextDouble();
	if (side3 < 0) {
		System.out.println("Incorrect input");
		System.exit(1);
	}
	    newScan.nextLine();
	System.out.println("Enter the color");
	String color = newScan.nextLine();
	
	System.out.println("Is it filled? Enter True or False");
	boolean filled = newScan.nextBoolean();
	
		newScan.close();
		
	
	   Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);
	
	System.out.println("Area is " + triangle1.getArea());
	System.out.println("Perimeter is " + triangle1.getPerimeter());
	System.out.println("Color is " + triangle1.getColor());
	System.out.println("Is it filled? " + triangle1.isFilled());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }
	
}
