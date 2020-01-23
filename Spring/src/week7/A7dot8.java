/**
 * 
 */
package week7;

/**
 * @author Nate
 *
 */
public class A7dot8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double[] firstArray = {4,22.2,13,9,6,24.1,18,7.5};
		
	
		
		
		
		System.out.println(average(firstArray));
		int[] intArray = {5, 5, 5, 5};
		System.out.println(average(intArray));
		
	}
	public static double average(int[] arrayOfIntegers)   {
		
		double[] doubleArray = new double[arrayOfIntegers.length];
		
		for(int i = 0; i < arrayOfIntegers.length; i++) {
			
			doubleArray[i] = arrayOfIntegers[i];
			
			
			
			
		}
		return average(doubleArray);
		
			
		
		
		
	}
	
	public static double average(double[] arrayOfDoubles)  {
		double theAverage = 0;
		double sum = 0;
		
		for(int i = 0; i < arrayOfDoubles.length; i++) {
			sum += + arrayOfDoubles[i];
		}
		theAverage = sum / arrayOfDoubles.length;
		return theAverage;
	
	}
	
}
