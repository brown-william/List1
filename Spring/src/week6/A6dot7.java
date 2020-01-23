/**
 * 
 */
package week6;
import java.util.Scanner;
/**
 * @author Nate
 *
 */
public class A6dot7 {

	/**
	 * This program will take parameters from the user to compute future investment.
	 */
	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		
		//take input from the user, first investment amount
		System.out.println("Enter investment amount");
		
		double investment = input.nextDouble();
		//take Interest rate
		System.out.println("Enter interest rate. ie .09 for 9%");
		
		double interestRate = input.nextDouble();
		
		//take number of years
		System.out.println("Enter number of years");
		int years = input.nextInt();
		
		if(years < 0 || years > 60) {
			System.out.println("Invalid investment");
			System.exit(1);
		}
		
		
		System.out.printf("%-15s %-15s", "Years", "Future Value");
		
		for(int i = 0; i > 30; i++) {
			
			
			System.out.printf("%-15.1f %-15.3f\n", years, futureInvestmentValue(investment, interestRate, years));
			
			
		}
		
		
		

	}
//
	public static double futureInvestmentValue(double investment, double interestRate, int years)  {
	
		double interest = interestRate / 12;
		double rate = interest + 1;
		int t = years * 12;
		double futureValue = investment * Math.pow(rate, t);
		
		
		return futureValue;
	}
}
