/**

 * Convert Miles to Kilometers
 */

package week5;
/**
 * @author Nate Brown
 */
public class A5dot3 {
	
	public static boolean debug = false;

	/**
	 * This program will print out a table with the the conversion of pounds to kilograms
	 */
	public static void main(String[] args) {
		if (debug)
			System.out.println("Debug turned on! ");
		
		
		
		
		System.out.printf("%-10s %-10s%n", "Pounds", "Kilograms");
		for(double pound=1; pound <=100; pound = pound + 1) {
			
			double kilogram = pound * 2.2;
			
		
			
		System.out.printf("%-10.0f %-10.1f%n", pound, kilogram);
		pound++;
		
		
			
		
		}
		
	}
}