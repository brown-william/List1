/**
 * 
 */
package week8;
import java.util.Date;
/**
 * @author Nate
 *
 */
public class A9dot3 {

	
	
	public static void main(String[] args) {
		
		
	Date date1 = new Date();
		
		for(long i = 10000; i < 100000000001L; i*= 10) {
			
			date1.setTime(i);
			
			System.out.println(date1.toString());
		}
		
	
	}
	
	
	
}
