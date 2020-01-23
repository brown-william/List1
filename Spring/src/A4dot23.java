import java.util.Scanner;
/**
 * 
 */

/**
 * @author Nate
 *
 */
public class A4dot23 {

	/**
	 * Get parameters from user
	 * Employee's name
	 * Number of hours worked in a week
	 * hourly pay rate
	 * federal tax withholding rate(e.g.,20%)
	 * State tax withholding rate (e.g.,9%
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//prompt user for name
		
		System.out.println("Employee's name");
		String empName = input.nextLine();
		//prompt user for number of hours worked in a week
		System.out.println("Number of hours worked");
		double hours = input.nextDouble();
		//prompt user for hourly pay rate
		System.out.println("Hourly pay rate");
		double hourlyPay = input.nextDouble();
		//prompt user for federal tax withholding rate
		System.out.println("Federal tax withholding rate, ie .20");
		double fedTax = input.nextDouble();
		//prompt user for Stat tax withholding rate
		System.out.println("State tax withholding rate, e.g. .09");
		double stateTax = input.nextDouble();
		double grossPay = hourlyPay * hours;
		double fedWith = fedTax * grossPay;
		double stateWith = stateTax * grossPay;
		double totalW = stateTax + fedTax; 
		double netPay = grossPay - (fedWith + stateWith);
		//process information and return proper values
		
		System.out.println("Employee Name: " + empName);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: " + hourlyPay);
		System.out.printf("Gross Pay: %4.2f", grossPay);
		System.out.println("Deductions:");
		System.out.printf("Federal Withholding " + fedTax + ":$ %4.2f",fedWith); 
		System.out.printf("State Withholding " + stateTax + ":$ %4.2f",stateWith);
		System.out.printf("Total Deduction: $%4.2f",totalW);
		System.out.printf("Net Pay: $%4.2f",netPay);
	
		
		
	
	}

}
