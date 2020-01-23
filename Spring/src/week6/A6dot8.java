/**
 * 
 */
package week6;

/**
 * @author Nate
 *
 */
public class A6dot8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this will print the headers to our program
		System.out.printf("%-15s %-15s | %-15s %-15s %n", "Fahrenheit", "Celcius", "Celcius","Fahrenheit");
		System.out.println("--------------------------------------------------------------------");
		// A for loop that will print our lists 
		for(int i = 10; i >= 1; i--) {
			double celcius = i + 30;
			double fahrenheit = i * 10 + 20;
			
			
		
		System.out.printf("%-15.1f %-15.3f | %-15.1f %-15.1f\n", fahrenheit, fahrenheitToCelcius(fahrenheit), celcius, celciusToFahrenheit(celcius));
		
		}
		
		
	}
	//method that will calculate fahrenheit to celcius.
	public static double fahrenheitToCelcius(double fahrenheit) {
		double celcius = ((5.0 / 9) * (fahrenheit - 32));
		return celcius;
	}
	

	//method that will calculate celcius to fahrenheit.
		public static double celciusToFahrenheit(double celcius) {
			double fahrenheit = ((9.0 / 5) * celcius + 32);
			return fahrenheit;
		}

	
}
